package Exercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < args.length; i++){
            String arquivo = args[i];
            InputStream is = new FileInputStream(arquivo); 
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();

            System.out.println("Arquivo " + (i + 1));
            while(s != null){
                System.out.println(s);
                s = br.readLine();
            }
            System.out.println(""); 
            br.close();
        }



    }
}
