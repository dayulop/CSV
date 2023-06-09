package org.example;
import com.opencsv.CSVReader;
import modelo.Equipo;
import modelo.Partido;
import modelo.Pronostico;

import java.io.FileReader;
import java.nio.file.Path;

public class Main {
    //mvn package
    //java -jar target/Prueba2-1.0-SNAPSHOT.jar src/main/resources/Resultados.csv

    public static void main(String[] args) throws Exception {

        String  File = "C:\\Users\\ariel\\Documents\\GitHub\\CSV\\Prueba2\\src\\main\\resources\\pronostico.csv";
        CSVReader reader   = new CSVReader(new FileReader(args[0]));

        String[]  nextLine = new String[10];
        String[]  temporal = new String[10];

        Integer[] columna1 = new Integer[10];  //guarda el id del equipo 1 de cada fila(cada fila equivale a un partido)
        String[]  columna2 = new String[10];   //guarda el nombre del equipo 1 de cada fila
        Integer[] columna3 = new Integer[10];//goles equipo 1

        Integer[] columna4 = new Integer[10];  //goles equipo 2
        String[]  columna5 = new String[10];   //nombre equipo 2
        Integer[] columna6 = new Integer[10];  //id equipo 2
        
        String[]  columna7 = new String[10];   //descripcion equipo 1
        String[]  columna8 = new String[10];   //descripcion equipo 2

        try{
            nextLine = reader.readNext();
            String [] fila = new String[]{nextLine[0]};//TODO tendria que ir aumentando el argumento de nexLine(solo lee la primer fila)

            for(int i=0; i< fila.length;i++){//este for recorre las filas del texto

                temporal= fila[i].split(";");//guarda lo que hay en la fila separado por ";". asi se genera las columnas

                columna1[i]= Integer.parseInt(temporal[0]);
                columna2[i]= temporal[1];
                columna3[i]= Integer.parseInt(temporal[2]);
                columna4[i]= Integer.parseInt(temporal[3]);
                columna5[i]= temporal[4];
                columna6[i]= Integer.parseInt(temporal[5]);
                columna7[i]= temporal[6];
                columna8[i]= temporal[7];
            }

        }catch (Exception e){
            System.out.println("algo fallo arriba  " + e);
        }
        Equipo equipo1  = new Equipo(columna1[0],columna2[0],columna7[0]);
        Equipo equipo2  = new Equipo(columna6[0],columna5[0],columna8[0]);

        Partido partido1= new Partido(1,equipo1,equipo2,columna3[0],columna4[0]);
        Pronostico pronostico1= new Pronostico(1,"mariana",partido1, equipo1.id(), "ganador",1);
        pronostico1.getData();

    }
}