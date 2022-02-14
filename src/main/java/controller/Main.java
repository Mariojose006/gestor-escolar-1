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
import com.google.gson.Gson;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
          Json json = new Json();
          Escola escola = new Escola();
          Auxiliar aux = new Auxiliar();
          String pathArquivoJson = "src\\main\\java\\model\\turmas.json";
          File file = new File(pathArquivoJson);
          System.out.println(file.getAbsolutePath());
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