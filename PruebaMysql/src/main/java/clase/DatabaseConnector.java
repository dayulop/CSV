package clase;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
    static final String contraseña= "10s09s2000";
    public void llenarBaseDeDatos() throws  IOException{
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticador", "root", contraseña);
            Statement stmt = con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //post: lee desde la base de dato la tabla de partidos y carga lo leido en la competencia.
    public void cargarPartidos(Competencia competencia) throws IOException {
        Partido partidoLeido;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticador", "root", contraseña);
            Statement stmt = con.createStatement();

            ResultSet rs= stmt.executeQuery("SELECT * FROM partidos");

            while(rs.next()){
                partidoLeido= new Partido(rs.getInt(PRIMERA_POSICION),
                        rs.getInt(SEGUNDA_POSICION),
                        rs.getString(TERCERA_POSICION),
                        rs.getString(SEXTA_POSICION),
                        rs.getInt(CUARTA_POSICION),
                        rs.getInt(QUINTA_POSICION));

                competencia.agregar_partido(partidoLeido);
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    //post: lee desde la base de dato la tabla de pronosticos y carga lo leido en la competencia.
    public void cargarPronosticos(Competencia competencia) {
        Pronostico pronosticoLeido;
        int pronosticoPartido;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pronosticador", "root", contraseña);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM partidos");

            while (rs.next()) {
                String[] caracteristicasPronostico = new String[]{rs.getString(QUINTA_POSICION),rs.getString(SEPTIMA_POSICION)};

                pronosticoPartido = determinarPronosticoRealizado(caracteristicasPronostico);
                pronosticoLeido = new Pronostico(rs.getInt(SEGUNDA_POSICION), rs.getInt(TERCERA_POSICION), pronosticoPartido);

                competencia.agregar_pronostico(pronosticoLeido, rs.getString(PRIMERA_POSICION));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //post: determina el pronostico realizado. Devuelve 1 si gana el equipo 1, 2 si gana el equipo 2 y 0 si es empatan.
    private int determinarPronosticoRealizado(String[] caracteristicasPronostico){
        int pronosticoRealizado;

        if(caracteristicasPronostico[PRIMERA_POSICION].equals(INDICADOR)) {
            pronosticoRealizado = GANA_EQUIPO1;
        } else if(caracteristicasPronostico[SEGUNDA_POSICION].equals(INDICADOR)){
            pronosticoRealizado = GANA_EQUIPO2;
        } else {
            pronosticoRealizado = EMPATE;
        }
        return pronosticoRealizado;
    }
}
