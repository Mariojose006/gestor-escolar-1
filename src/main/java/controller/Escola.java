/*
    Adrian Machado -  201965001AB   
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import model.Json;
import model.arquivos;


/*
* Representa a escola em que o sistema foi implementado;
* Contem lista dos alunos e professores da escola cadastrados pelo administrador;
*/

public class Escola {
    public static String cpfUserLogado; 
    public static ArrayList <Aluno> alunos = new ArrayList<>();
    public static ArrayList <Professor> professores = new ArrayList<>();
    public static ArrayList <Disciplina> disciplinas = new ArrayList<>();
    public static ArrayList <Turma> turmas = new ArrayList<>();
    
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
    public static ArrayList buscarTurmaProfessor(Professor professor){
        ArrayList<Turma> turmaaux = new ArrayList<>();
        for(Turma t: Escola.turmas){
             if(t.getProfessor().getCpf().equals(professor.getCpf()) ){
                 if(!turmaaux.contains(t)){
                     turmaaux.add(t);
                 }
                
             }
                 
                 
             
         }
         System.out.println("tamanho da turma"+turmaaux.size());
         return turmaaux;
    }
    public static Professor buscarProfessor(String cpf){
        
        for(Professor p: Escola.professores)
        {
             if(p.getCpf().equals(cpf)){
               return p;
        }
         }   
         return null;
    }
   
    public void ler2(String path) 
    {
        ArrayList<String> dadosStringLinhaJson = new ArrayList<>();
        dadosStringLinhaJson.addAll(arquivos.lerArquivo(path));
//        for(String a:dadosStringLinhaJson){
//             turmas.add(gson.jsonToTurma(a));
//        }
        turmas.addAll(gson.toTurmas(dadosStringLinhaJson));
        this.processaAlunos();
        this.processaProfessores();
        this.processaDisciplinas();
    }
    public void ler(String path){
        ArrayList<String> dadosStringLinhaJson = new ArrayList<>();
        dadosStringLinhaJson.add(arquivos.lerArquivo(path).get(0).toString());
        Auxiliar aux = new Auxiliar();
        aux = gson.jsonToEscola(dadosStringLinhaJson.get(0));
        turmas.addAll(aux.turmas);
        System.out.println(turmas.size());
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
    public void alteraNota(Turma turma, Aluno aluno, String nota1,String nota2,String nota3){
       for(int i = 0; i< turmas.size();i++){
           if(turmas.get(i).equals(turma)){
               for(int j =0;i<turma.getAlunos().size();i++){
                   if(turma.getAlunos().get(j).equals(aluno)){
                       ArrayList<String> nt = new ArrayList();
                       nt.add(nota3);
                       nt.add(nota2);
                       nt.add(nota1);
                       turmas.get(i).getAlunos().get(j).setNotas(nt);
                       
                       
                   }
               }
           }
       }
    }
    public static List buscaNota(Turma turma, Aluno aluno){
       ArrayList<String> notas = new ArrayList();
//        for(int i = 0; i< turmas.size()-1;i++){
//           if(turmas.get(i).getNome().equals(turma.getNome())){
//               for(int j =0;i<turma.getAlunos().size()-1;i++){
//                   if(turma.getAlunos().get(j).getCpf().equals(aluno.getCpf())){
//                       notas.addAll(turmas.get(i).getAlunos().get(j).getNotas()); 
//                       
//                   }
//               }
//           }
//       }

        for(Turma t: Escola.turmas){
            if(t.getNome().equals(turma.getNome())){
               for(Aluno a: Escola.alunos){ 
                   if(a.getCpf().equals(aluno.getCpf())){
                       notas.addAll(a.getNotas());
                   }
               
               }
            }
        }
       return notas;
    }
    public static void atualizaArquivo(){
        String pathArquivoJson = "src\\main\\java\\model\\turmas.json";
        Auxiliar aux = new Auxiliar();
        aux.turmas.addAll(Escola.turmas);
        Json json = new Json();
        String um = json.escolaToJson(aux);
        arquivos.escreverArquivo(pathArquivoJson,um);
    }
    
}
