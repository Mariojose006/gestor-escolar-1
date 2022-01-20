/*
    Adrian Machado -  201965001AB   
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;


/**
* Representa a escola em que o sistema foi implementado;
* Contem lista dos alunos e professores da escola cadastrados pelo administrador;
*/

public class Escola {
    protected static ArrayList <Aluno> alunos;
    protected static ArrayList <Professor> professores;
    protected static ArrayList <Disciplina> disciplinas;

    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionaProfessor(Professor professor){
        professores.add(professor);
    }

    public void adicionaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}
