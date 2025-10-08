package bean;

import jakarta.annotation.ManagedBean;

@ManagedBean

public class Aluno {
    String nome;
    String senha;
    
    public Aluno(){
        
    }
    
    public String validar() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
