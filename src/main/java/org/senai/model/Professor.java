package org.senai.model;

public class Professor {
    private int id;
    private String nomeProfessor;
    private int turmaId; // Alterado para armazenar o ID da turma
    private double salario;

    public Professor(int id, String nomeProfessor, int turmaId, double salario) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.turmaId = turmaId;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public double getSalario() {
        return salario;
    }
}
