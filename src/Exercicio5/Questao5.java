package Exercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Questao5 {
    public static void main(String[] args) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        File inputFile = new File("personagens.xml");

        Personagens personagens = xmlMapper.readValue(inputFile, Personagens.class);

        for (Personagem personagem : personagens.getPersonagens()) {
            System.out.println("Nome: " + personagem.getNome() + " - " +personagem.getClasse());
        }
    }
}

