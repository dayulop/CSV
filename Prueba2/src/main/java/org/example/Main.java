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
        String archivo= "primer_partido";

        CSVReader reader = new CSVReaderBuilder(new FileReader("primer_partido.csv")).build();
        String[] nextLine;
        int[] columna1;
        String[] columna2;

        nextLine = reader.readNext();
        char [] caracteres = nextLine[0].toCharArray();

        for(int i=0; i< caracteres.length;i++){
            int minimo=0;
            int maximo;
            if( caracteres[i] == ){

            }



            System.out.println(caracteres[i]);
        }









        /*TODO try{ NO FUNCA NADA de lo que sigue
            List <DatoResultados> beans = new CsvToBeanBuilder(new FileReader("primer_partido.csv"))
                    .withType(DatoResultados.class).build().parse();
        }catch (Exception e){
            System.out.println(e);
        }*/
    }
}