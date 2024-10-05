package org.senai.dao;

import org.senai.connection.ConnectionFactory;
import org.senai.model.Turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {

    public void insert(Turma turma) {
        String sql = "INSERT INTO turmas (nome_turma) VALUES (?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, turma.getNomeTurma());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAll() {
        String sql = "DELETE FROM turmas";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Turma> getAll() {
        List<Turma> turmas = new ArrayList<>();
        String sql = "SELECT * FROM turmas";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nomeTurma = rs.getString("nome_turma");
                Turma turma = new Turma(id, nomeTurma);
                turmas.add(turma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return turmas;
    }
}
