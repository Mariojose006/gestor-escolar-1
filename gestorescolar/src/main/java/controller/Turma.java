/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
* Representa uma turma da escola;
* Contém uma lista de alunos cadastrados pelo Administrador;
*/

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private Disciplina disciplina;
    //Map<Aluno,ArrayList<Integer>> notas = new HashMap<Aluno,ArrayList<Integer>>();
    int cod;

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void setAlunos(ArrayList<Aluno> alunoss){
        this.alunos = alunoss;
    }
    public void setProfessor(Professor prof){
        this.professor = prof;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

}