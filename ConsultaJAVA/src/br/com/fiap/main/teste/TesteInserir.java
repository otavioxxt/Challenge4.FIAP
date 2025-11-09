package br.com.fiap.main.teste;

import br.com.fiap.DAO.PacienteDAO;
import br.com.fiap.beans.Paciente;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserir {
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        PacienteDAO pacienteDAO = new PacienteDAO();
        Paciente paciente = new Paciente();

        Paciente objPaciente = new Paciente();
        objPaciente.setNome(texto("Informe o nome do paciente"));
        objPaciente.setCpf(texto("Informe o CPF"));
        objPaciente.setSexo(texto("Informe o sexo"));
        objPaciente.setIdade(inteiro("Informe o idade"));
        objPaciente.setPeso(real("Informe o peso"));
        objPaciente.setAltura(real("Informe o altura"));

        System.out.println(PacienteDAO.inserir(objPaciente));

    }

}
