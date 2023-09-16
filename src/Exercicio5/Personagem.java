package Exercicio5;

import java.io.Serializable;

public class Personagem implements Serializable{
    String nome;
    long id;
    String descricao;
    String classe;

    public Personagem(String nome, long id, String classe,String descricao){
        this.nome = nome;
        this.id = id;
        this.classe = classe;
        this.descricao = descricao;
    }

    public Personagem(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString(){
        return nome + ": " + classe;
    }
    


}


