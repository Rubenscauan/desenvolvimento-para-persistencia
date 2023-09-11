package Exercicio4;

import java.io.*;
import java.util.zip.*;

/*Crie uma aplicação em Java que recebe via linha de comando 
(1) o nome de um arquivo compactado a ser criado e (2) uma pasta. 
Compactar todos os arquivos e subpastas em um arquivo compactado com extensão zip. */

public class Questao1 {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Uso correto: java Questao1 arquivo.zip pasta");
            System.exit(1);
        }

        String arquivoZip = args[0];
        String pasta = args[1];

        FileOutputStream fos = new FileOutputStream(arquivoZip);
        ZipOutputStream zos = new ZipOutputStream(fos);

        compactarPasta(pasta, zos);

        zos.close();
    }

    private static void compactarPasta(String pasta, ZipOutputStream zos) throws IOException {
        File pastaCompactada = new File(pasta);

        for (File item : pastaCompactada.listFiles()) {
            if (item.isDirectory()) {
                compactarPasta(item.getPath(), zos); 
            } else {
                ZipEntry zipEntry = new ZipEntry(item.getPath().substring(pastaCompactada.getPath().length() + 1));
                zos.putNextEntry(zipEntry);

                FileInputStream fis = new FileInputStream(item);

                int conteudo;
                while ((conteudo = fis.read()) != -1) {
                    zos.write(conteudo);
                }

                zos.closeEntry();
                fis.close();
            }
        }
    }
}
