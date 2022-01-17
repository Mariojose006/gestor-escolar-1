/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B

*/ 
package controller;

/**
* Representa uma turma da escola;
* Contém uma lista de alunos cadastrados pelo Administrador;
*/

public class Turma {
    private String nome;
    private Aluno alunos;

    public Turma(String nome, Aluno alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }
    
    
}
