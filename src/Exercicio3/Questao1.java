package Exercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questao1 {

    public static void main(String[] args) throws IOException {

        String arquivo = args[0];
        String delimitador = args[1];
        List<String> colunasSelecionadas = new ArrayList<>();
        for (int i = 2; i < args.length; i++) {
            colunasSelecionadas.add(args[i]);
        }

        Map<String, Double> somasColunas = new HashMap<>();
        Map<String, Long> contagensColunas = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linhaCabecalho = br.readLine();
        String[] cabecalhos = linhaCabecalho.split(delimitador);

        for (String coluna : colunasSelecionadas) {
            somasColunas.put(coluna, 0.0);
            contagensColunas.put(coluna, 0L);
        }

        String linha;
        while ((linha = br.readLine()) != null) {
            String[] valores = linha.split(delimitador);
            for (int i = 0; i < cabecalhos.length; i++) {
                String cabecalho = cabecalhos[i];
                if (somasColunas.containsKey(cabecalho)) {
                    String valor = valores[i];
                    
                    double valorNumerico = Double.parseDouble(valor);
                    somasColunas.put(cabecalho, somasColunas.get(cabecalho) + valorNumerico);
                    contagensColunas.put(cabecalho, contagensColunas.get(cabecalho) + 1);

                }
            }
        }

        for (String coluna : colunasSelecionadas) {
            long contagem = contagensColunas.get(coluna);
            if (contagem > 0) {
                double soma = somasColunas.get(coluna);
                double media = soma / contagem;
                System.out.println("Coluna: " + coluna);
                System.out.println("Soma: " + soma);
                System.out.println("Média: " + media);
            } else {
                System.out.println("Coluna " + coluna + " não possui valores numéricos.");
            }
        }
        br.close();
    }

}
