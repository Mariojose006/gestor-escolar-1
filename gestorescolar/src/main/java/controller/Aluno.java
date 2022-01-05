
package controller;

import java.util.List;


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
