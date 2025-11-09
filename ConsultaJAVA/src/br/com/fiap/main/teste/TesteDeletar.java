package br.com.fiap.main.teste;

import br.com.fiap.DAO.PacienteDAO;
import br.com.fiap.beans.Paciente;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletar {
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        Paciente paciente = new Paciente();

        Paciente objPaciente = null;
        objPaciente.setNome(texto("Informe o nome do paciente a ser deletado"));

        System.out.println(PacienteDAO.deletar(objPaciente.getNome()));
    }

}
