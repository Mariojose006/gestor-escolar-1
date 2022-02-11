/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package controller;
import com.github.javafaker.Faker;
import model.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
          Json json = new Json();
          String pathArquivoJson = "src\\main\\java\\model\\turmas.json";
          ArrayList<Turma> turmas = new ArrayList<>();
          ArrayList<String> nt = new ArrayList();
          nt.add("0");
          nt.add("0");
          nt.add("0");
          Faker faker = new Faker(new Locale("pt-BR"));
          for(int i = 0;i<3;i++){
              Turma turma = new Turma("Turma teste" + i);
              Professor professor = new Professor(i,"senha"+i,"teste"+i,"2222222222222","profteste"+i,"3333333",1);
              turma.setProfessor(professor);
              turma.setMaxAlunos(35);
              for(int j = 0; j<5;j++){
                  Aluno aluno = new Aluno(j,"aluno123","Andre"+i,"07653511619","Andre reis","32998041251",2);

                  turma.addAluno(aluno);
              }
              turmas.add(turma);
          }
          for(Turma turma: turmas){
              Files.write(pathArquivoJson, json.turmaToJson(turma));
          }
            
            Escola escola = new Escola();
            escola.ler(pathArquivoJson);
            Professor professor = new Professor(0,"senha0","teste0","2222222222222","profteste0","3333333",1);
            System.out.println(escola.buscarTurmaProfessor(professor).size()); 
            System.out.println("Quantidade alunos: " + escola.alunos.size());
            System.out.println("Quandidade Professores: "+escola.professores.size());
            System.out.println("Quantidade turmas: "+escola.turmas.size());
            System.out.println("Quantidade disciplinas: "+ escola.disciplinas.size());
            System.out.println();
    }
}