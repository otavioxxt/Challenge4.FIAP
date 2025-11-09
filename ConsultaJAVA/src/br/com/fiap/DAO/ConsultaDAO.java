package br.com.fiap.DAO;
import br.com.fiap.beans.Consulta;
import br.com.fiap.beans.Enfermeiro;
import br.com.fiap.beans.Medico;
import br.com.fiap.beans.Paciente;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {
    public static Connection minhaConexao;

    public ConsultaDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }


    public static String inserir(Consulta consulta) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into CONSULTA");
        stmt.setString(1, Consulta.getData());
        stmt.setString(2, Consulta.getHora());
        stmt.setString(3, Medico.getMedico());



        stmt.execute();
        stmt.close();

        return "Paciente cadastrado com sucesso!";
    }

    public static String deletar(String data) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Delete from CONSULTA where DATA   = ?");
        stmt.setString(1, data);

        stmt.execute();
        stmt.close();

        return "Paciente deletado com sucesso!";
    }

    public String atualizar(Consulta consulta) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Update PACIENTE set DATA = ?, S = ?, IDADE = ?, PESO = ?, ALTURA = ? where NOME = ?");
        stmt.setString(1, Consulta.getData());
        stmt.setString(2, Consulta.getHora());
        stmt.setString(3, Medico.getMedico());



        stmt.executeUpdate();
        stmt.close();

        return "Paciente atualizado com sucesso!";
    }

    public List<Paciente> selecionar() throws SQLException {
        List<Paciente> listaPACIENTE = new ArrayList<Paciente>();
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Select * from CONSULTA");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Consulta ObjConsulta = new Consulta();
            Consulta objConsulta = null;
            Medico medico = new Medico();
            objConsulta.setData(rs.getString("NOME"));
            objConsulta.setHora(rs.getString("CPF"));


        }
        return listaPACIENTE;

    }

}
