package Exercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        String url = args[0];
        String texto = args[1];

        InputStream is = new FileInputStream(url); 
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        for(int i = 1;; i++){
            String s = br.readLine();
            if(s == null){
                break;
            }
            if(s.contains(texto)){
                System.out.println("linha " + i + ":" + s);
            }
        }

        br.close();

    }
}
