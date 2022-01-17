/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B

*/ 
package controller;

import java.util.List;

/**
* Representa o usuário aluno;
* Possui única finalidade de consultar as notas de suas disciplinas através do método exibirnotas();
* As notas são inseridas pelo usário professor através do método setNotas(List notas);
*/

public class Aluno extends Pessoa {

    private List notas; 

   
    
    public Aluno(String senha, String login, String cpf, String nome, String telefone) {
        super(senha, login, cpf, nome, telefone);
    }

    public Aluno() {
    }
    
     public List getNotas() {
        return notas;
    }

    public void setNotas(List notas) {
        this.notas = notas;
    }
    
    public void ExibeNotas(){
    
    
    } 
}
