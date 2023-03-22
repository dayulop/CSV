package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CSVManage {
    private String linea;
    private String[] partes = null;

    public CSVManage() {
    }

    public static void writeCSV(String file) {
        Scanner dato = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("id;nombre1;goles1;goles2;nombre2;");
            System.out.println("nombre del equipo 1");
            String equipo1 = dato.nextLine();
            System.out.println("numero de goles equipo 1");
            int goles1 = dato.nextInt();
            System.out.println("nombre del equipo 2");
            String equipo2 = dato.nextLine();
            equipo2 = dato.nextLine();
            System.out.println("numero de goles equipo 2");
            int goles2 = dato.nextInt();
            printWriter.println("1;" + equipo1 + ";" + goles1 + ";" + goles2 + ";" + equipo2 + ";2");
            printWriter.flush();
            printWriter.close();
        } catch (IOException var10) {
            System.out.println(var10);
        }

    }

    public void readFileCsv(String file) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((this.linea = bufferedReader.readLine()) != null) {
                this.partes = this.linea.split(";");
                this.imprimirLinea();
                System.out.println();
            }

            bufferedReader.close();
            this.linea = null;
            this.partes = null;
        } catch (IOException var4) {
            System.out.println(var4);
        }

    }
    public void imprimirLinea() {
        for(int i = 0; i < this.partes.length; ++i) {
            String var10001 = this.partes[i];
            System.out.print(var10001 + " | ");
        }

    }

    int randomNumber() {
        Random n_random = new Random();
        int new_number = n_random.nextInt(5002);
        return new_number;
    }
}