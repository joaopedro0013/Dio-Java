package com.escola;

public class aluno {
    private int idade;
    private String nome;
    private String turma;

    public aluno( int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }


    
}
