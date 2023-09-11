package Exercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;

public class Questao2 {
    public static void main(String[] args) {

        String arquivo = args[0];
        String arquivoEncript = args[1];
        String chave = args[2];

        try {
            SecretKeySpec chaveSecreta = new SecretKeySpec(chave.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, chaveSecreta);

            FileInputStream arquivoEntrada = new FileInputStream(arquivo);
            FileOutputStream arquivoSaida = new FileOutputStream(arquivoEncript);

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
