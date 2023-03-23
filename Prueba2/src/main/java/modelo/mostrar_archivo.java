package modelo;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;

public class mostrar_archivo {
    public static void printnlFile(String file) throws Exception{
        CSVReader reader = new CSVReaderBuilder(new FileReader("primer_partido.csv")).build();
        String[] nextLine;
        while (null != (nextLine = reader.readNext())) {
            System.out.println(nextLine[0]);
        }
    }
    public static char toCharArray(String archivo){
        return archivo.toCharArray()[0];
    }
}
