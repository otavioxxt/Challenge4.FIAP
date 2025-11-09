package br.com.fiap.main.teste;
import br.com.fiap.beans.Paciente;
import br.com.fiap.DAO.PacienteDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteAtualizar {
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, SQLException {
        Paciente  objpaciente = new Paciente();
        PacienteDAO pacienteDAO = new PacienteDAO();

        objpaciente.setNome(texto("Nome"));
        objpaciente.setCpf(texto("Cpf"));
        objpaciente.setSexo(texto("Sexo"));
        objpaciente.setIdade(inteiro(texto("Idade")));
        objpaciente.setPeso(real(texto("Peso")));
        objpaciente.setAltura(real(texto("Altura")));

        System.out.println(pacienteDAO.atualizar(objpaciente));

    }
}
