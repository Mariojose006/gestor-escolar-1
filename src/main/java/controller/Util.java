/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
    Adrian Machado -  201965001AB   
    André Reis - 
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;


public class Util {

      
    public static int login(String login, String senha){
        // criar 3 listas (Aluno,Professores e adm)
        ArrayList<String> alunos = new ArrayList<String>();
        alunos.addAll(model.Files.read("./dadosAlunos.txt"));
        
        ArrayList<String> professores = new ArrayList<String>();
        professores.addAll(model.Files.read("./dadosProfessores.txt"));
        
        ArrayList<String> administrador = new ArrayList<String>();
        administrador.addAll(model.Files.read("./dadosAdministrador.txt"));
        // contatenar as 3 listas em uma lista só
        ArrayList<String> usuarios = new ArrayList<String>();
        usuarios.addAll(alunos);
        usuarios.addAll(professores);
        usuarios.addAll(administrador);
        // percorrer a lista e comparar login e senha
        // ALUNO == ALN // PROFESSOR = PRF // Administrador == ADM
        
        int tam = usuarios.size();
            Pessoa p = new Pessoa() ;
            boolean s = false,l = false;
            for(int i = 0; i<= (tam - 1);i++)
            {
                //p = Pessoa.toPessoa(usuarios.get(i));
                String tipo = p.getLogin().substring(0, 3);
                System.out.println(p.getNome()+" - "+p.getLogin()+" - "+p.getSenha());
                System.out.println(tipo);
                if(p.getLogin().equals(login)  && p.getSenha().equals(senha) && tipo.equals("ALN")) {
                    // logado
                    /*
                       aluno                  
                    */
                    //FrameAluno fmAluno = new FrameAluno();
                    //fmAluno.setVisible(true);
                    
                    return 0;
                } else if(p.getLogin().equals(login)  && p.getSenha().equals(senha) && tipo.equals("ADM")) {
                    // logado
                    /*
                       administrador 
                    */
                    //FrameAdm fmAdm = new FrameAdm();
                    //fmAdm.setVisible(true);
                    return 0;
                }else if(p.getLogin().equals(login)  && p.getSenha().equals(senha) && tipo.equals("PRF")) {
                    // logado
                    /*
                       professor 
                    */
                    //FrameProfessor fmProf = new FrameProfessor();
                    //fmProf.setVisible(true);
                    //return 0;
                }
            }
            if(((l == false) && (s == false)) ||((l == true) && (s == false))||((l == false) && (s == true)) )    
            {
                System.out.println("usuário ou senha inválido");
            }
        
        return 0;
        
    }
    
    
}
