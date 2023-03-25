package org.example;
import com.opencsv.CSVReader;

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
        Integer[] columna4 = new Integer[10]; //goles equipo 2
        String[]  columna5 = new String[10];   //nombre equipo 2
        Integer[] columna6 = new Integer[10];  //id equipo 2

        //TODO: se supone que entra toda la primer linea del archivo que mande. con split la va devolviendo por partes
        try{
            nextLine = reader.readNext();
            String [] caracteres = new String[]{nextLine[0]};//tendria que ir aumentando el argumento de nexLine pero tengo una sola linea

            for(int i=0; i< caracteres.length;i++){//este for recorre las filas del texto

                temporal= caracteres[i].split(";");//guarda lo que hay en la fila separado por ";". asi se genera las columnas

                columna1[i]= Integer.parseInt(temporal[0]);
                columna2[i]= temporal[1];
                columna3[i]= Integer.parseInt(temporal[2]);
                columna4[i]= Integer.parseInt(temporal[3]);
                columna5[i]= temporal[4];
                columna6[i]= Integer.parseInt(temporal[5]);

                System.out.println("id "+ columna1[i] + " nombre del equipo 1 " + columna2[i] +"\n" +
                        "goles equipo 1 " + columna3[i] + "\n" +
                        "goles equipo 2 " + columna4[i] + "\n" +
                        "nombre equipo 2 " + columna5[i] + "\n" +
                        "id " + columna6[i] );//TODO esto solo es para probar. borrar luego
            }
        }catch (Exception e){
            System.out.println("algo fallo arriba  " + e);
        }
        

    }
}