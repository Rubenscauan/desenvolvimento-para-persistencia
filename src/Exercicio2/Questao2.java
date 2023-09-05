package Exercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Questao2 {
    public static void main(String[] args) throws IOException {
        String origem = args[0];
        String destino = args[1];


        try{
            InputStream is = new FileInputStream(origem);
            OutputStream os = new FileOutputStream(destino);
            byte[] buffer = new byte[8192];

            long inicio = System.currentTimeMillis();
            int byteslidos = is.read(buffer);
            
            while(byteslidos != -1){
                os.write(buffer, 0, byteslidos);
                byteslidos = is.read(buffer);
            }

            is.close();
            os.close();

            long termino = System.currentTimeMillis();

            System.out.println("O tempo de leitura e escrita foi: " + (termino-inicio) + " ms");
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }

    }
}
