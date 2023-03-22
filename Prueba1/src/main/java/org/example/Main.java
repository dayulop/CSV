package org.example;
import com.opencsv.bean.CsvToBeanBuilder;
import modelo.DatoEquipo;
import modelo.Partido;
import modelo.no_utilizado.Equipo;
import modelo.Pronostico;

import java.io.FileReader;
import java.util.List;
//11:24 ver clase
public class Main {
    public static void main(String[] arg) throws Exception {
        String File = "C:\\Users\\ariel\\Documents\\GitHub\\CSV\\Prueba1\\src\\main\\resources\\primeros_dos_partidos.csv";
        
        if(arg.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
            System.exit(88);
        }
        List <DatoEquipo> listaEquipos;

        try{
            listaEquipos = new CsvToBeanBuilder(new FileReader(arg[0]))
                    .withType(DatoEquipo.class)
                    .build()
                    .parse();

            for(DatoEquipo equipo : listaEquipos) {
                System.out.println(equipo.getTeam1_description() + ";" + equipo.getTeam2_description());
            }

        } catch(Exception e) {
            e.printStackTrace();
            System.err.println(e);
        }

        DatoEquipo equipo = new DatoEquipo(1,"argentina","selecionado",4, 2,2, "arabia", "selecionado" );
        //lo de arriba si llena al equipo pero con datos que le coloco no con lo que lee.
        System.out.println(equipo.getTeam1_description() + ";" + equipo.getTeam2_description() + "holaaa");

    }
    public static void equipos(){
        Equipo argentina = new Equipo(
                1,
                "Argentina",
                "Seleccionado"

        );
        Equipo arabiaS = new Equipo(
                2,
                "Arabia Saudita",
                "Seleccionado"

        );
        Equipo polonia = new Equipo(
                3,
                "Polonia",
                "Seleccionado"

        );
        Equipo mexico = new Equipo(
                4,
                "Mexico",
                "Seleccionado"
        );

        /* argentina.getData();
        arabiaS.getData();
        polonia.getData();
        mexico.getData(); */

        Partido partido1 = new Partido(
                1,
                argentina.id,
                arabiaS.id,
                1,
                2
        );
        Partido partido2 = new Partido(
                2,
                polonia.id,
                mexico.id,
                0,
                0
        );

        //partido1.getData();
        //partido2.getData();

        Pronostico mariana = new Pronostico(
                1,
                "Mariana",
                partido1,
                argentina.id,
                "GANADOR",
                + 1
        );

        mariana.getData();
    }
}