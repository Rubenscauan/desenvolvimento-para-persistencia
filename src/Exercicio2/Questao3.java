package Exercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Questao3 {
    public static void main(String[] args) throws IOException {
        String origem = args[0];
        String destino = args[1];

        try {
            InputStream is = new FileInputStream(origem);
            InputStreamReader isr = new InputStreamReader(is, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);


            OutputStream os = new FileOutputStream(destino);
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = br.readLine();

            while(linha != null){
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            }

            bw.close();
            br.close();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
