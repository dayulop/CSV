package org.example;
import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;
import modelo.DatoEquipo;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        if(args.length == 0){
            System.out.println("ERROR: No ingresaste ningún archivo como argumento! volve a probar pibe");
            System.exit(666);
        }
        List <DatoEquipo> listaEquipos;
        try {
            listaEquipos= new CsvToBeanBuilder(new FileReader(args[0]))
                    .withType(DatoEquipo.class)
                    .build()
                    .parse();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}