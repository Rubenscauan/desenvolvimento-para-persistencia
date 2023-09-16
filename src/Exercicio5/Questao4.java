package Exercicio5;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Questao4 {
    public static void main(String[] args) throws Exception{
        Personagens personagens = new Personagens();
        personagens.adicionarPersonagem(new Personagem("Garen", 1, "Tanque", "Por Demaciaaaaa!"));
        personagens.adicionarPersonagem(new Personagem("Teemo", 2, "Atirador", "O Satanás de Yordle!"));
        
        XmlMapper xmlMapper = new XmlMapper();

        File outputFile = new File("personagens.xml");

        xmlMapper.writeValue(outputFile,personagens);

    }
}
