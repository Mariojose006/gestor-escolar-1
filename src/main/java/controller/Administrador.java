/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B

*/ 
package controller;

import java.util.ArrayList;


/**
* Representa o administrador geral do sistema;
* Responsável por criar as turmas e cadastrar suas disciplinas, cadastrar os professores de
* determinada disciplina e inserir os alunos nas turmas atráves de seus respectivos métodos;                           
*/
public class Administrador {
    private String senha;
    private String login;    

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
    
}
