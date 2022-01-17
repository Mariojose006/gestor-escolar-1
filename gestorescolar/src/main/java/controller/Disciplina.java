/*
    Adrian Machado -     
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

/**
* Representa uma disciplina cadastrada em qualquer turma da escola; 
* Parâmetros são preenchidos exclusivamente pelo administrador atráves do método
* cadastrarDisciplinar();
*/
public class Disciplina {
    private String nome;
    private String sala;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, String sala) {
        this.nome = nome;
        this.sala = sala;
    }
}
