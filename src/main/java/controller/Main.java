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
          String pathArquivoJson = "C:\\Users\\adria\\OneDrive\\Documents\\UFJF\\gestor-escolar\\src\\main\\java\\model\\turmas.json";
//          ArrayList<Turma> turmas = new ArrayList<>();
//          Faker faker = new Faker(new Locale("pt-BR"));
//          for(int i = 0;i<100;i++){
//              Turma turma = new Turma(faker.educator().course());
//              Professor professor = new Professor(faker.number().randomDigitNotZero(),faker.gameOfThrones().house(),faker.gameOfThrones().character(),faker.gameOfThrones().character(),faker.name().fullName(),null,0);
//              turma.setProfessor(professor);
//              turma.setMaxAlunos(35);
//              for(int j = 0; j<20;j++){
//                  Aluno aluno = new Aluno(faker.number().randomDigitNotZero(),faker.gameOfThrones().house(),faker.gameOfThrones().character(),faker.gameOfThrones().character(),faker.name().fullName(),null,1);
//                  turma.addAluno(aluno);
//              }
//              turmas.add(turma);
//          }
//          for(Turma turma: turmas){
//              Files.write(pathArquivoJson, json.turmaToJson(turma));
//          }
    
            Escola escola = new Escola();
            escola.ler(pathArquivoJson);
            System.out.println("Quantidade alunos: " + escola.alunos.size());
            System.out.println("Quandidade Professores: "+escola.professores.size());
            System.out.println("Quantidade turmas: "+escola.turmas.size());
            System.out.println("Quantidade disciplinas: "+ escola.disciplinas.size());
            System.out.println();
    }
}