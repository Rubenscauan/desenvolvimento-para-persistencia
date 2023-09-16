package Exercicio5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personagens implements Serializable {
    private List<Personagem> personagens;

    public Personagens() {
        this.personagens = new ArrayList<>();
    }


    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    @Override
    public String toString() {
        return 
               "Personagens = " + personagens +
               '}';
    }
}
