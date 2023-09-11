package Exercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;

/*Crie uma aplicação em Java que recebe via linha de comando 
(1) o nome de um arquivo a ser decriptado e 
(2) o nome do arquivo resultante da decriptação e 
(3) a chave de decriptação. */

public class Questao3 {
    public static void main(String[] args) {   
        String arquivo = args[0];
        String arquivoDecriptado = args[1];
        String chave = args[2];

        try {
            SecretKeySpec chaveSecreta = new SecretKeySpec(chave.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, chaveSecreta);

            FileInputStream arquivoEntrada = new FileInputStream(arquivo);
            FileOutputStream arquivoSaida = new FileOutputStream(arquivoDecriptado);

            CipherOutputStream fluxo = new CipherOutputStream(arquivoSaida, cipher);

            int linha;

            while ((linha = arquivoEntrada.read()) != -1) {
                fluxo.write(linha);
            }

            fluxo.close();
            arquivoEntrada.close();
            arquivoSaida.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
