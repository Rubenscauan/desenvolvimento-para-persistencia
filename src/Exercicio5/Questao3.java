package Exercicio5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Questao3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("personagens.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fis);
        
        Personagens personagens = (Personagens) objectIn.readObject();
        
        for (Personagem personagem : personagens.getPersonagens()) {
            System.out.println(personagem.getNome() + ": " + personagem.getClasse());
        }

        objectIn.close();


}}
