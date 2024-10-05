package org.senai.dao;

import org.senai.connection.ConnectionFactory;
import org.senai.model.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    public void insert(Professor professor) {
        String sql = "INSERT INTO professores (nome_professor, turma_id, salario) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getNomeProfessor());
            stmt.setInt(2, professor.getTurmaId());
            stmt.setDouble(3, professor.getSalario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAll() {
        String sql = "DELETE FROM professores";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Professor> getAll() {
        List<Professor> professores = new ArrayList<>();
        String sql = "SELECT * FROM professores";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nomeProfessor = rs.getString("nome_professor");
                int turmaId = rs.getInt("turma_id");
                double salario = rs.getDouble("salario");
                Professor professor = new Professor(id, nomeProfessor, turmaId, salario);
                professores.add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professores;
    }
}
