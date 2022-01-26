/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package controller;
import static controller.Escola.turmas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.*;
import controller.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Json json = new Json();
        /*
        //Alunos
        Aluno aluno1 = new Aluno(1,"adrian", "adrian", "07653511619", "Adrian", "32998040251",0);
        Aluno aluno2 = new Aluno(2,"mario", "mario", "05784741258", "mario", "358874125747",0);
        Aluno aluno3 = new Aluno(3,"andre", "andre", "02258744125", "andre", "3547412587",0);
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        //professor 
        Professor prof = new Professor(1,"gleiph", "glieph", "05587884511", "gleiph", "32558741254",1);

        //disciplina
        Disciplina disciplina = new Disciplina("Orientação objetos", "A3012");
        
        //turma
        Turma turmaOO = new Turma("ADM");
        turmaOO.setAlunos(alunos);
        turmaOO.setDisciplina(disciplina);
        turmaOO.setProfessor(prof);
        
        String turmaOOjson = json.turmaToJson(turmaOO);
        System.out.println(turmaOOjson);
        Files.write("C:\\Users\\Rubeus\\Documents\\gestor-escolar\\src\\main\\java\\model\\turmas.json", turmaOOjson);*/
       
        ArrayList<String> leitura = new ArrayList<>();
        arquivos file = new arquivos();
        leitura.addAll(arquivos.lerArquivo("C:\\Users\\Rubeus\\Documents\\gestor-escolar\\src\\main\\java\\model\\turmas.json")) ;
        ArrayList<Turma> aux = new ArrayList();
       // aux.addAll(file.read("../model/turmas.json"));
        for(String a:leitura)
        {            
            aux.add(json.jsonToTurma(a));
        }
        System.out.println(aux.get(0).getIndexAlunos(1).getNome()); 
    }
}