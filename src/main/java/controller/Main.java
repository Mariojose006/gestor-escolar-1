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
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
          Json json = new Json();
          Escola escola = new Escola();
          Auxiliar aux = new Auxiliar();
          String pathArquivoJson = "src\\main\\java\\model\\turmas.json";          
//          ArrayList<Turma> turmas = new ArrayList<>();
//          ArrayList<Professor> professor = new ArrayList<>();
//          ArrayList<Aluno> aluno = new ArrayList<>();
//          ArrayList<String> nt = new ArrayList();
//          nt.add("10");
//          nt.add("7");
//          nt.add("8");
//          
//          Aluno aluno0 = new Aluno(01,"senha","adrian","11111111111","Adrian","32446783726",2,nt);
//          Aluno aluno1 = new Aluno(02,"senha","mario","22222222222","Andre reis","32998654345",2,nt);
//          Aluno aluno2 = new Aluno(03,"senha","jose","33333333333","Andre reis","32556765434",2,nt);
//          Aluno aluno3 = new Aluno(04,"senha","pedro","44444444444","Andre reis","32556543578",2,nt);
//          Aluno aluno4 = new Aluno(05,"senha","paulo","55555555555","Andre reis","767787643",2,nt);
//          aluno.add(aluno1);aluno.add(aluno2);aluno.add(aluno3);aluno.add(aluno4);
//          
//          Professor pf1 = new Professor(01,"senhaum","testeum","66666666666","ProfessorUM","3333333",1);
//          Professor pf2 = new Professor(02,"senhadois","testedois","77777777777","ProfessorDOIS","3333333",1);
//          Professor pf3 = new Professor(03,"senhatres","testetres","88888888888","ProfessorTRES","3333333",1);
//          professor.add(pf1);
//          professor.add(pf2);
//          professor.add(pf3);
//          Disciplina d1 = new Disciplina("Disciplina1", "Sala1");
//          Disciplina d2 = new Disciplina("Disciplina2", "Sala2");
//          Disciplina d3 = new Disciplina("Disciplina3", "Sala3");
//          Turma t1 = new Turma("Turma1");
//          Turma t2 = new Turma("Turma2");
//          Turma t3 = new Turma("Turma3");
//          t1.setAlunos(aluno);
//          t1.setDisciplina(d1);
//          t1.setProfessor(pf1);
//          t2.setAlunos(aluno);
//          t2.setDisciplina(d2);
//          t2.setProfessor(pf2);
//          t3.setAlunos(aluno);
//          t3.setDisciplina(d2);
//          t3.setProfessor(pf2);          
//          turmas.add(t1);
//          turmas.add(t2);
//          turmas.add(t3);
//          
//          aux.setTurmas(turmas);
//          String um = json.escolaToJson(aux);
//         
//          
//          arquivos.escreverArquivo(pathArquivoJson,um);
//          
            escola.ler(pathArquivoJson);           
            Login login = new Login();
            login.setVisible(true);
            
            System.out.println("Quantidade alunos: " + escola.alunos.size());
            System.out.println("Quandidade Professores: "+escola.professores.size());
            System.out.println("Quantidade turmas: "+escola.turmas.size());
            System.out.println("Quantidade disciplinas: "+ escola.disciplinas.size());
            System.out.println();
    }
}