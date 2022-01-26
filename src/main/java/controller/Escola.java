/*
    Adrian Machado -  201965001AB   
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;
import model.Files;
import model.Json;


/**
* Representa a escola em que o sistema foi implementado;
* Contem lista dos alunos e professores da escola cadastrados pelo administrador;
*/

public class Escola {
    protected static ArrayList <Aluno> alunos;
    protected static ArrayList <Professor> professores;
    protected static ArrayList <Disciplina> disciplinas;
    protected static ArrayList <Turma> turmas;
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionaProfessor(Professor professor){
        professores.add(professor);
    }

    public void adicionaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void ler()
    {
        
        Json gson = new Json();
        Files file = new Files();
        ArrayList<String> aux = new ArrayList();
        aux.addAll(file.read("../model/turmas.json"));
        for(String a:aux)
        {            
            turmas.add(gson.jsonToTurma(a));
        }
    } 
}
