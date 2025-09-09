package br.com;

public class Tarefa{
    private String descricao;
    private boolean concluida;
    public Tarefa(String descricao) {
        this descricao = descricao;
        this concluida = false;
    }
    public String getDescricao(){
        return descricao;
    }
    public boolean isConcluida(){
        return concluida;
    }
    public void marcarComoConcluída(){
        this concluida = true;

    }
}