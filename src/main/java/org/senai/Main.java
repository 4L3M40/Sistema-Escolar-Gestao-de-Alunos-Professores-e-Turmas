package org.senai;

import org.senai.dao.AlunoDAO;
import org.senai.dao.ProfessorDAO;
import org.senai.dao.TurmaDAO;
import org.senai.model.Aluno;
import org.senai.model.Professor;
import org.senai.model.Turma;

public class Main {
    public static void main(String[] args) {
        // Criando os DAOs
        AlunoDAO alunoDAO = new AlunoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        TurmaDAO turmaDAO = new TurmaDAO();

        // Deletando todos os registros existentes
        alunoDAO.deleteAll();
        professorDAO.deleteAll();
        turmaDAO.deleteAll();

        // Criando e inserindo turmas
        Turma turma1 = new Turma(1, "1A");
        Turma turma2 = new Turma(2, "1B");
        turmaDAO.insert(turma1);
        turmaDAO.insert(turma2);

        // Criando e inserindo 3 alunos
        Aluno aluno1 = new Aluno(1, "Evandro Wagenckncht", 1, 4.5);
        Aluno aluno2 = new Aluno(2, "Christofer Pfeiffer", 1, 7.0);
        Aluno aluno3 = new Aluno(3, "Dante Moon", 2, 8.0);
        alunoDAO.insert(aluno1);
        alunoDAO.insert(aluno2);
        alunoDAO.insert(aluno3);

        // Criando e inserindo 3 professores
        Professor professor1 = new Professor(1, "Prof. Maria", 1, 3000.0);
        Professor professor2 = new Professor(2, "Prof. João", 2, 3200.0);
        Professor professor3 = new Professor(3, "Prof. Ana", 1, 3100.0);
        professorDAO.insert(professor1);
        professorDAO.insert(professor2);
        professorDAO.insert(professor3);

        // Exibindo todos os registros
        System.out.println("Turmas:");
        turmaDAO.getAll().forEach(turma -> System.out.println("ID: " + turma.getId() + ", Nome: " + turma.getNomeTurma()));

        System.out.println("\nAlunos:");
        alunoDAO.getAll().forEach(aluno -> System.out.println("ID: " + aluno.getId() + ", Nome: " + aluno.getNomeAluno() + ", Turma ID: " + aluno.getTurmaId() + ", Nota: " + aluno.getNota()));

        System.out.println("\nProfessores:");
        professorDAO.getAll().forEach(professor -> System.out.println("ID: " + professor.getId() + ", Nome: " + professor.getNomeProfessor() + ", Turma ID: " + professor.getTurmaId() + ", Salário: " + professor.getSalario()));
    }
}
