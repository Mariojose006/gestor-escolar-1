
package controller;

import java.util.ArrayList;

/**
 *
 * @author Rubeus
 */

/**
* Representa o administrador geral do sistema;
* Responsável por criar as turmas e cadastrar suas disciplinas, cadastrar os professores de
* determinada disciplina e inserir os alunos nas turmas atráves de seus respectivos métodos;                           
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
