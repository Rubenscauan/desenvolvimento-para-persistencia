package Exercicio5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Questao2 {
    public static void main(String[] args) throws IOException{
        Personagens personagens = new Personagens();
        personagens.adicionarPersonagem(new Personagem("Garen", 1, "Tanque", "Por Demaciaaaaa!"));
        personagens.adicionarPersonagem(new Personagem("Teemo", 2, "Atirador", "O Satanás de Yordle!"));

        FileOutputStream fos = new FileOutputStream("personagens.ser");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fos);

        objectOutput.writeObject(personagens);

        objectOutput.close();

        
        
    }
}
