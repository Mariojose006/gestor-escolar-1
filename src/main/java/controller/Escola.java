/*
    Adrian Machado -  201965001AB   
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;
import model.Files;
import model.Json;


/*
* Representa a escola em que o sistema foi implementado;
* Contem lista dos alunos e professores da escola cadastrados pelo administrador;
*/

public class Escola {
    public ArrayList <Aluno> alunos = new ArrayList<>();
    public ArrayList <Professor> professores = new ArrayList<>();
    public ArrayList <Disciplina> disciplinas = new ArrayList<>();
    public ArrayList <Turma> turmas = new ArrayList<>();
    
    Json gson = new Json();
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionaProfessor(Professor professor){
        professores.add(professor);
    }

    public void adicionaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public ArrayList buscarTurmaProfessor(Professor professor){
        ArrayList<Turma> turmaaux = new ArrayList<>();
        for(Turma t: this.turmas){
             if(t.getProfessor().getCpf().equals(professor.getCpf()) )
             turmaaux.add(t);
         }   
         return turmaaux;
    }
   
    public void ler(String path)
    {
        ArrayList<String> dadosStringLinhaJson = new ArrayList<>();
        dadosStringLinhaJson.addAll(Files.read(path));
        for(String a:dadosStringLinhaJson){
             turmas.add(gson.jsonToTurma(a));
        }
        this.processaAlunos();
        this.processaProfessores();
        this.processaDisciplinas();
    }
    public void processaAlunos(){
        for(Turma turmaAux: turmas){
            for(Aluno alunoAux: turmaAux.getAlunos()){
                if(alunos.contains(alunoAux)){
                    //não adicona o aluno,pois ele já está na lista principal
                }
                else if(!alunos.contains(alunoAux)){
                    alunos.add(alunoAux);
                }
            }
        }
    }
    public void processaProfessores(){
        for(Turma turmaAux: turmas){
            if(professores.contains(turmaAux.getProfessor())){
                // não adiciona o professor pois ele já está na lista principal
            }
            else if(!professores.contains(turmaAux.getProfessor())){
                professores.add(turmaAux.getProfessor());
            }
        }
    }
    public void processaDisciplinas(){
        for(Turma turmaAux: turmas){
            if(disciplinas.contains(turmaAux.getDisciplina())){
                // não adiciona a disciplina pois ele já está na lista principal
            }
            else if(!disciplinas.contains(turmaAux.getDisciplina())){
                disciplinas.add(turmaAux.getDisciplina());
            }
        }
    }
    
    public ArrayList turmasAlunoCursa(Aluno aluno){
        ArrayList <Turma> turmasAux = new ArrayList<>();
        for(Turma a: this.turmas){
            if(a.getAlunos().contains(aluno)){
                turmasAux.add(a);
            }
        }
        return turmasAux;
    }
    public ArrayList alteraNota(Turma turma, Aluno aluno, Float nota1,Float nota2,Float nota3){
       for(int i = 0; i< turmas.size();i++){
           if(turmas.get(i).equals(turma)){
               for(int j =0;i<turma.getAlunos().size();i++){
                   if(turma.getAlunos().get(j).equals(aluno)){
                       turmas.get(i).getAlunos().get(j).setNotas(nota1);
                       turmas.get(i).getAlunos().get(j).setNotas(nota2);
                       turmas.get(i).getAlunos().get(j).setNotas(nota3);
                   }
               }
           }
       }
    }
    
}
