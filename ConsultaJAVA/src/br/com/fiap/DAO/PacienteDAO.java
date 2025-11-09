package br.com.fiap.DAO;
import br.com.fiap.beans.Paciente;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    public static Connection minhaConexao;

    public PacienteDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }


    public static String inserir(Paciente paciente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into PACIENTE");
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, paciente.getCpf());
        stmt.setString(3, paciente.getSexo());
        stmt.setInt(4, paciente.getIdade());
        stmt.setDouble(5, paciente.getPeso());
        stmt.setDouble(6, paciente.getAltura());

        stmt.execute();
        stmt.close();

        return "Paciente cadastrado com sucesso!";
    }

    public static String deletar(String nome) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Delete from PACIENTE where NOME = ?");
        stmt.setString(1, nome);

        stmt.execute();
        stmt.close();

        return "Paciente deletado com sucesso!";
    }

    public String atualizar(Paciente paciente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Update PACIENTE set CPF = ?, SEXO = ?, IDADE = ?, PESO = ?, ALTURA = ? where NOME = ?");
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, paciente.getCpf());
        stmt.setString(3, paciente.getSexo());
        stmt.setInt(4, paciente.getIdade());
        stmt.setDouble(5, paciente.getPeso());
        stmt.setDouble(6, paciente.getAltura());


        stmt.executeUpdate();
        stmt.close();

        return "Paciente atualizado com sucesso!";
    }

    public List<Paciente> selecionar() throws SQLException {
        List<Paciente> listaPACIENTE = new ArrayList<Paciente>();
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Select * from PACIENTE");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Paciente objPaciente = new Paciente();
            objPaciente.setNome(rs.getString("NOME"));
            objPaciente.setCpf(rs.getString("CPF"));
            objPaciente.setSexo(rs.getString("SEXO"));
            objPaciente.setIdade(rs.getInt("IDADE"));
            objPaciente.setPeso(rs.getDouble("PESO"));
            objPaciente.setAltura(rs.getDouble("ALTURA"));
            listaPACIENTE.add(objPaciente);
        }
         return listaPACIENTE;

    }

}
