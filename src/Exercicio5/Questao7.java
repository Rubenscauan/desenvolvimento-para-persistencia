package Exercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Questao7 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File inputFile = new File("personagens.json");
        List<Personagem> personagens = objectMapper.readValue(
            inputFile,
            objectMapper.getTypeFactory().constructCollectionType(List.class, Personagem.class)
        );

        for (Personagem personagem : personagens) {
            System.out.println("Nome: " + personagem.getNome());
            System.out.println("Classe: " + personagem.getClasse());
            System.out.println("Descrição: " + personagem.getDescricao());
        }
    }
}
