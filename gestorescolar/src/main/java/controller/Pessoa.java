
package controller;


public class Pessoa {
    private String senha;
    private String login; 
    private String cpf;
    private String nome;
    private String telefone;

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

    public Pessoa(String senha, String login, String cpf, String nome, String telefone) {
        this.senha = senha;
        this.login = login;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {
    }
}
