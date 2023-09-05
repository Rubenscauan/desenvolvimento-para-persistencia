package Exercicio1;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Questao1 {
    public static void main(String[] args) throws IOException {
        String url = args[0];
        //Para agilizar na hora de apresentar 
        //USAR: src/Exercicio1/arquivo.txt
        InputStream is = new FileInputStream(url); 
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for(int i = 0; i < 10; i++){
            String s = br.readLine();
            System.out.println(s);
        }
        br.close();
    }
}
