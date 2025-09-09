package br.com.domain.entity;

public class Contato{
    private String telefone;
    private String email;
    private String endereco;

    public Contato( String telefone,String email,String endereco){
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;

    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}