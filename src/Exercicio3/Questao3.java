package Exercicio3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/*Escreva um arquivo de propriedades Java via editor de textos. 
Esse arquivo deve ter os dados de chave e valor. Exemplo:

    arquivo config.properties
    arquivo = meu_arquivo.txt
    linha_inicial = 1
    linha_final = 3

Depois, escreva uma classe Java que exibe da linha_inicial até a linha_final do arquivo, 
conforme definidos no arquivo de propriedades config.properties.

 */

public class Questao3 {
    public static void main(String[] args) throws IOException {
        Properties config = new Properties();
        config.load(new FileInputStream("config.properties"));
        String arquivo = config.getProperty("arquivo");
        String linhaInicial = config.getProperty("linha_inicial");
        String linhaFinal = config.getProperty("linha_final");

        int inicio = Integer.parseInt(linhaInicial);
        int fim = Integer.parseInt(linhaFinal);

        InputStream is = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 1; i < inicio; i++) {
            br.readLine();
        }

        String linha;
        for (int i = inicio; i <= fim; i++) {
            linha = br.readLine();
            if (linha != null) {
                System.out.println(linha);
            } else {
                System.out.println("--Arquivo menor do que a linha final definida.--");
                break; 
            }
        }

        br.close();
    }
}
