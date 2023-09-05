package Exercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("arquivoBase.txt"));
        Scanner strings = new Scanner(System.in);
        String novoNome;
        while (true) {
            String input = strings.nextLine();
            if (input.equals("fim")) {
                System.out.println("Escolha um nome para o arquivo: ");
                Scanner nome = new Scanner(System.in);
                novoNome = nome.nextLine();
                nome.close();
                break;
            }
            writer.write(input);
            writer.newLine();
        }
        writer.close();
        strings.close();

        File arquivoBase = new File("arquivoBase.txt");
        File arquivoFinal = new File(novoNome + ".txt");
        arquivoBase.renameTo(arquivoFinal);
    }
}
