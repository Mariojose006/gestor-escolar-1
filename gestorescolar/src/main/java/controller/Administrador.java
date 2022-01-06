/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Rubeus
 */
public class Administrador {
    private String senha;
    private String login;
    protected static ArrayList <Aluno> alunos;
    protected static ArrayList <Professor> professores;

    public Administrador(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public Administrador() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

//    public Aluno getAlunos() {
//        return alunos;
//    }
//
//    public void setAlunos(Aluno alunos) {
//        this.alunos = alunos;
//    }
//
//    public Professor getProfessores() {
//        return professores;
//    }
//
//    public void setProfessores(Professor professores) {
//        this.professores = professores;
//    }
    
    public void cadastraAluno(){
    
    }
    
    public void cadastraProfessor(){
    
    }
    public void cadastraDisciplina(){
    
    }
}
