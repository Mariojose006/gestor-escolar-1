/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Files;
import model.Json;

public class Main {
    public static void main(String[] args) {
        Json json = new Json();
        
        //Alunos
        Aluno aluno1 = new Aluno("adrian", "adrian", "07653511619", "Adrian", "32998040251");
        Aluno aluno2 = new Aluno("mario", "mario", "05784741258", "mario", "358874125747");
        Aluno aluno3 = new Aluno("andre", "andre", "02258744125", "andre", "3547412587");
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        //professor 
        Professor prof = new Professor("gleiph", "glieph", "05587884511", "gleiph", "32558741254");

        //disciplina
        Disciplina disciplina = new Disciplina("Orientação objetos", "A3012");
        
        //turma
        Turma turmaOO = new Turma("AOO");
        turmaOO.setAlunos(alunos);
        turmaOO.setDisciplina(disciplina);
        turmaOO.setProfessor(prof);
        
        String turmaOOjson = json.turmaToJson(turmaOO);
        System.out.println(turmaOOjson);
        Files.write("gestorescolar/src/main/java/model/turmas.json", turmaOOjson);

    }
}