/*
    Adrian Machado - 201965001AB
    Mário José - 201965507B

*/ 
package controller;

import com.google.gson.Gson;
import java.util.Objects;


public class Pessoa {
    private int id;
    private String senha;
    private String login; 
    private String cpf;
    private String nome;
    private String telefone;
    private int tipoUsuario;
    
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoUsuário() {
        return tipoUsuario;
    }

    public void setTipoUsuário(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Pessoa(int id, String senha, String login, String cpf, String nome, String telefone, int tipoUsuario) {
        this.id = id;
        this.senha = senha;
        this.login = login;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }
    
    

    public Pessoa() {
        
    }
    
    public static Pessoa toPessoa(String conteudo) {
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(conteudo, Pessoa.class);

        return pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
}
