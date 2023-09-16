package Exercicio5;

import java.io.IOException;

public class Questao1 {
    public static void main(String[] args) throws IOException {
        Personagem garen = new Personagem("Garen",1,"Tanque","Por Demaciaaaaa!");
        Personagem lux = new Personagem("Lux",2,"Mago","Vamos iluminar isso aqui.");

        Personagens personagens = new Personagens();

        personagens.adicionarPersonagem(garen);
        personagens.adicionarPersonagem(lux);

        System.out.println(personagens);


    }

}
