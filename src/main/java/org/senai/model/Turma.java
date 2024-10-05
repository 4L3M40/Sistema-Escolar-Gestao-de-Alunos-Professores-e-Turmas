package org.senai.model;

public class Turma {
    private int id;
    private String nomeTurma;

    public Turma(int id, String nomeTurma) {
        this.id = id;
        this.nomeTurma = nomeTurma;
    }

    public int getId() {
        return id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }
}
