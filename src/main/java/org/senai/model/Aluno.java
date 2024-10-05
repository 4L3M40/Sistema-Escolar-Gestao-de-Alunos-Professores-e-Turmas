package org.senai.model;

public class Aluno {
    private int id;
    private String nomeAluno;
    private int turmaId; // Alterado para armazenar o ID da turma
    private double nota;

    public Aluno(int id, String nomeAluno, int turmaId, double nota) {
        this.id = id;
        this.nomeAluno = nomeAluno;
        this.turmaId = turmaId;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public double getNota() {
        return nota;
    }
}
