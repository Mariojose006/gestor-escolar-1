/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package model;
import com.google.gson.Gson;
import controller.Administrador;
import controller.Aluno;
import controller.Disciplina;
import controller.Escola;
import controller.Professor;
import controller.Turma;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import controller.Auxiliar;
import java.lang.reflect.Type;



public class Json {
    Gson gson = new Gson();
    //ADM
    public String AdmToJson(Administrador adm){
        return gson.toJson(adm);
        
    }
    public Administrador jsonToAdm(String json){
        Administrador adm = gson.fromJson(json, Administrador.class);
        return adm;
    }
    //Aluno
    public String AlunoToJson(Aluno aluno){
        return gson.toJson(aluno);
    }
    public Aluno jsonToAluno(String json){
        Aluno aln = gson.fromJson(json, Aluno.class);
        return aln;
    }
    //Disciplina
    public String DisciplinaToJson(Disciplina disciplina){
        return gson.toJson(disciplina);
    }
    public Disciplina jsonToDisciplina(String json){
        Disciplina disc = gson.fromJson(json, Disciplina.class);
        return disc;
    }
    //Professor
    public String ProfessorToJson(Professor professor){
        return gson.toJson(professor);
    }
    public Professor jsonToProf(String json){
        Professor prof = gson.fromJson(json, Professor.class);
        return prof;
    }
    //Turma
//    public String turmaToJson(Turma turma){
//        return gson.toJson(turma);
//    }
     public String turmaToJson(ArrayList<Turma> turma){
        return gson.toJson(turma);
    }
    
    public Turma jsonToTurma(String json){
        Turma turma = gson.fromJson(json, Turma.class);
        return turma;
    }
   public  List<Turma> toTurmas(ArrayList<String> json) {
        Type turmasTipo = new TypeToken<ArrayList<Turma>>() {
        }.getType();
        List<Turma> turmas = gson.fromJson(json.get(0), turmasTipo);

        return turmas;
    }
    
     //Escola
    public String escolaToJson(Auxiliar escola){
        return gson.toJson(escola);
    }
    public Auxiliar jsonToEscola(String json){
        Auxiliar escola = gson.fromJson(json, Auxiliar.class);
        return escola;
    }
}
