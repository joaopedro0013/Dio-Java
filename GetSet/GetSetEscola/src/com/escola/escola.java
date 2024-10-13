package com.escola;

public class escola {
    public static void main(String[] args) throws Exception {
        aluno aluno = new aluno(22,"João");

       
        aluno.setTurma("3a2");

        System.out.println("O nosso melhor aluno o " + aluno.getNome() + " tem " + aluno.getIdade() + " e é da Turma " + aluno.getTurma());

    }
}
