package org.example;
import com.opencsv.*;
import com.opencsv.CSVReader;
import java.io.*;
import java.io.FileReader;

import com.opencsv.bean.AbstractCsvConverter;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import modelo.DatoResultados;
import modelo.mostrar_archivo;

import java.nio.file.*;
import java.util.*;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.*;
public class Main {
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(args[0]));
        String[] nextLine= new String[1];//les puse de argumento un 1 pero creo que esta mal
        String[] temporal = new String[1];
        Integer[] columna1= new Integer[1];//guarda el id del equipo 1 de cada fila(cada fila equivale a un partido)
        String[] columna2 = new String[1];//guarda el nombre del equipo 1 de cada fila

        //TODO: se supone que entra toda la primer linea del archivo que mande. con split la va devolviendo por partes
        try{
            nextLine = reader.readNext();
            String [] caracteres = new String[]{nextLine[0]};//tendria que ir aumentando el argumento de nexLine pero tengo una sola linea

            for(int i=0; i< caracteres.length;i++){//este for recorre las filas del texto

                temporal= caracteres[i].split(";");//guarda lo que hay en la fila separado por ";". asi se genera las columnas

                for(int j=0;j< temporal.length;j++){//este for recorre las columnas del texto
                    columna1[i]= Integer.parseInt(temporal[0]);
                    columna2[i]= temporal[1];


                }
                System.out.println("id "+ columna1[i] + " nombre del equipo 1 " + columna2[i]);//esto solo es para probar que se guarde bien
            }
        }catch (Exception e){
            System.out.println("algo fallo arriba  " + e);
        }

    }
}