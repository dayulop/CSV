package clase;
import java.sql.*;

import java.io.IOException;

public class DatabaseConnector {
    static final int PRIMERA_POSICION = 0;
    static final int SEGUNDA_POSICION = 1;
    static final int TERCERA_POSICION = 2;
    static final int CUARTA_POSICION = 3;
    static final int QUINTA_POSICION = 4;
    static final int SEXTA_POSICION = 5;
    static final int SEPTIMA_POSICION = 6;
    static final int GANA_EQUIPO1 = 1;
    static final int GANA_EQUIPO2 = 2;
    static final int EMPATE = 0;
    static final String INDICADOR = "X";

    public void cargarPartidos(Competencia competencia) throws IOException {
        Partido partidoLeido;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticador", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs= stmt.executeQuery("SELECT * FROM partidos");

            while(rs.next()){
                partidoLeido= new Partido(rs.getInt(PRIMERA_POSICION),
                        rs.getInt(SEGUNDA_POSICION),
                        rs.getString(TERCERA_POSICION),
                        rs.getInt(CUARTA_POSICION),
                        rs.getInt(QUINTA_POSICION),
                        rs.getString(SEXTA_POSICION));

                competencia.agregarPartido(partidoLeido);
            }
            com.close();
        } cath(Exception e){
            System.out.println(e);
        }
    }

    public void cargarPronosticos(Competencia competencia){
        Pronostico pronosticoLeido;
        int pronosticoPartido;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticador", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs   = stmt.executeQuery("SELECT * FROM partidos");

            while(rs.next()){
                String[] caracteristicasPronostico= new String[] {rs.getString(QUINTA_POSICION), rs.getString(SEXTA_POSICION), rs.getString(SEPTIMA_POSICION) };
                pronosticoPartido = determinarPronosticoRealizado(caracteristicasPronostico);
                pronosticoLeido   = new Pronostico(rs.getInt(SEGUNDA_POSICION),rs.getInt(TERCERA_POSICION),pronosticoPartido);
                competencia.agregarPronostico(pronosticoLeido);
            }
            com.close();
        } cath(Exception e){
            System.out.println(e);
        }
    }
    private int determinarPronosticoRealizado( String[] caracteristicasPronostico){
        int pronosticoRealizado;

        if(caracteristicasPronostico[QUINTA_POSICION].equals(INDICADOR)) {
            pronosticoRealizado = GANA_EQUIPO1;
        } else if(caracteristicasPronostico[SEXTA_POSICION].equals(INDICADOR)){
            pronosticoRealizado = EMPATE;
        } else {
            pronosticoRealizado = GANA_EQUIPO2;
        }
        return pronosticoRealizado;
    }
}
