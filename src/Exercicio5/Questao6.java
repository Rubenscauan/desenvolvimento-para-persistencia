package Exercicio5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Questao6 {
    public static void main(String[] args) throws IOException{
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Personagem("Garen", 1, "Tanque", "Por Demaciaaaaa!"));
        personagens.add(new Personagem("Teemo", 2, "Atirador", "O Satanás de Yordle!"));

        ObjectMapper objectMapper = new ObjectMapper();

        File outputFile = new File("personagens.json");
        objectMapper.writeValue(outputFile, personagens);
    }
}
