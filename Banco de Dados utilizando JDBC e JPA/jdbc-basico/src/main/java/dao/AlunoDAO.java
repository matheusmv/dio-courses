package dao;

import config.ConnectionFactory;
import entities.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public List<Aluno> list() {

        List<Aluno> alunos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {

            final String sql = "SELECT * FROM aluno";

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                Long id = resultSet.getLong("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                String estado = resultSet.getString("estado");

                alunos.add(new Aluno(id, nome, idade, estado));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return alunos;
    }

    public Aluno getById(Long id) {

        Aluno aluno = new Aluno();

        try (Connection connection = ConnectionFactory.getConnection()) {

            final String sql = "SELECT * FROM aluno WHERE id = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                aluno.setId(rs.getLong("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setEstado(rs.getString("estado"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return aluno;
    }

    public void create(Aluno aluno) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            final String sql = "INSERT INTO aluno (nome, idade, estado) VALUES (?, ?, ?)";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEstado());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Success: " + rowsAffected + " rows.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void delete(Long id) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            final String sql = "DELETE FROM aluno WHERE id = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, id);

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Success: " + rowsAffected + " rows.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void update(Aluno aluno) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            final String sql = "UPDATE aluno SET nome = ?, idade = ?, estado = ? WHERE id = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEstado());
            stmt.setLong(4, aluno.getId());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Success: " + rowsAffected + " rows.");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
