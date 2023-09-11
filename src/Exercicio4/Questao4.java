package Exercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;

/*Crie uma aplicação em Java que recebe via linha de comando o nome de um arquivo 
para geração/armazenamento dos hashes  md5, sha1 e sha256 do arquivo especificado. 
A aplicação deve mostrar o tempo de execução de cada uma dessas operações.  */

public class Questao4 {
    public static void main(String[] args) throws Exception { 
        String arquivo = args[0];
        String saida = args[1];
        
        long startTime;
        long endTime;
        
        BufferedWriter escrita = new BufferedWriter(new FileWriter(saida));

        startTime = System.currentTimeMillis();
        String md5 = calcularMD5(arquivo);
        endTime = System.currentTimeMillis();
        escrita.write("MD5 DO DOCUMENTO: ");
        escrita.write(md5);
        escrita.write(" Calculado em: " + (endTime-startTime) + "ms");
        escrita.newLine();


        startTime = System.currentTimeMillis();
        String sha1 = calcularSHA1(arquivo);
        endTime = System.currentTimeMillis();
        escrita.write("SHA1 DO DOCUMENTO: ");
        escrita.write(sha1);
        escrita.write(" Calculado em: " + (endTime-startTime) + "ms");
        escrita.newLine();

        startTime = System.currentTimeMillis();
        String sha256 = calcularSHA256(arquivo);
        endTime = System.currentTimeMillis();
        escrita.write("SHA256 DO DOCUMENTO: ");
        escrita.write(sha256);
        escrita.write(" Calculado em: " + (endTime-startTime) + "ms");
        escrita.newLine();

        escrita.close();

        
    }

    public static String calcularMD5(String arquivo) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(Files.readAllBytes(Paths.get(arquivo)));
        return bytesToHex(digest);
    }

    public static String calcularSHA1(String arquivo) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("SHA-1");
        byte[] digest = md5.digest(Files.readAllBytes(Paths.get(arquivo)));
        return bytesToHex(digest);
    }

    public static String calcularSHA256(String arquivo) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("SHA-256");
        byte[] digest = md5.digest(Files.readAllBytes(Paths.get(arquivo)));
        return bytesToHex(digest);
    }




    public static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
