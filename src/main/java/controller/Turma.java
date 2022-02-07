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
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Disciplina disciplina;
    private int maxAlunos = 35;
    //Map<Aluno,ArrayList<Integer>> notas = new HashMap<Aluno,ArrayList<Integer>>();
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
    public Aluno getIndexAlunos(int i){
        return alunos.get(i);
    }
    public void setProfessor(Professor prof){
        this.professor = prof;
    }
    public Professor getProfessor(){
        return professor;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    public Disciplina setDisciplina(){
        return disciplina;
    }
    public int getMaxAlunos() {
        return maxAlunos;
    }
    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    

        
}