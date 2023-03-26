package org.example;
import com.opencsv.CSVReader;
import modelo.Equipo;
import modelo.Partido;
import modelo.Pronostico;

import java.io.FileReader;

public class Main {
    //mvn package
    //java -jar target/Prueba2-1.0-SNAPSHOT.jar src/main/resources/pronostico.csv

    public static void main(String[] args) throws Exception {

        CSVReader reader   = new CSVReader(new FileReader(args[0]));
        String[]  nextLine = new String[10];
        String[]  temporal = new String[10];

        Integer[] columna1 = new Integer[10];  //guarda el id del equipo 1 de cada fila(cada fila equivale a un partido)
        String[]  columna2 = new String[10];   //guarda el nombre del equipo 1 de cada fila
        Integer[] columna3 = new Integer[10];  //goles equipo 1
        Integer[] columna4 = new Integer[10];  //goles equipo 2
        String[]  columna5 = new String[10];   //nombre equipo 2
        Integer[] columna6 = new Integer[10];  //id equipo 2
        String[]  columna7 = new String[10];   //descripcion equipo 1
        String[]  columna8 = new String[10];   //descripcion equipo 2

        try{
            nextLine = reader.readNext();
            String [] caracteres = new String[]{nextLine[0]};//TODO tendria que ir aumentando el argumento de nexLine(solo lee la primer fila)

            for(int i=0; i< caracteres.length;i++){//este for recorre las filas del texto

                temporal= caracteres[i].split(";");//guarda lo que hay en la fila separado por ";". asi se genera las columnas

                columna1[i]= Integer.parseInt(temporal[0]);
                columna2[i]= temporal[1];
                columna3[i]= Integer.parseInt(temporal[2]);
                columna4[i]= Integer.parseInt(temporal[3]);
                columna5[i]= temporal[4];
                columna6[i]= Integer.parseInt(temporal[5]);
                columna7[i]= temporal[6];
                columna8[i]= temporal[7];

                System.out.println("id "+ columna1[i] + "\n"+
                        "nombre equipo 1 " + columna2[i] +"\n" +
                        "goles equipo 1 " + columna3[i] + "\n" +
                        "goles equipo 2 " + columna4[i] + "\n" +
                        "nombre equipo 2 " + columna5[i] + "\n" +
                        "id " + columna6[i] + "\n" +
                        "descripcion equipo 1 " + columna7[i] + "\n" +
                        "descripcion equipo 2 " + columna8[i]);//TODO esto de mostrar solo es para probar. borrar luego
            }

        }catch (Exception e){
            System.out.println("algo fallo arriba  " + e);
        }
        Equipo equipo1  = new Equipo(columna1[1],columna2[1],columna7[1]);
        Equipo equipo2  = new Equipo(columna6[1],columna5[1],columna8[1]);

        Partido partido1= new Partido(1,equipo1,equipo2,columna3[1],columna4[1]);
        System.out.println(partido1.getGoles_equipo1());
        //Pronostico pronostico1= new Pronostico(1,"mariana",partido1, equipo1.id(), "ganador",1);
        //pronostico1.puntos();

    }
}