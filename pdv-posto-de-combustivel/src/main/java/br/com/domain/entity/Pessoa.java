package br.com.domain.entity;

import java.util.Date;

 public class Pessoa{

    // atributos
    private String nomeCompleto;

    private String cpfCnpj;

    private Date dataNascimento;

    private Integer numerosCtps;

    //construtor

    Pessoa(String nomeCompleto,String cpfCnpj, Date dataNascimento, Integer numerosCtps ){
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numerosCtps = numerosCtps;


    }

    //getters
    public String getnomeCompleto(){
        return nomeCompleto;
     }
     public String getcpfCnpj() {
        return cpfCnpj;
     }
     public Date getdataNascimento() {
        return dataNascimento;
     }
     public Integer numerosCtps() {
        return numerosCtps;
         }


    //setters
     public void setnomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;

     }
     public void setCpfCnpj(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;

     }
     public void setdataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;

     }
     public void setnumerosCtps(Integer numerosCtps ) {
         this.numerosCtps = numerosCtps;
     }
}
