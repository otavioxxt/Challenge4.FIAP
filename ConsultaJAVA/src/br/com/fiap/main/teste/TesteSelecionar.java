package br.com.fiap.main.teste;
import br.com.fiap.beans.Paciente;
import br.com.fiap.DAO.PacienteDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TesteSelecionar {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        PacienteDAO pacienteDAO = new PacienteDAO();

        List<Paciente> listaPacientes = (ArrayList<Paciente>) pacienteDAO.selecionar();

        if(listaPacientes != null){
            for (Paciente paciente : listaPacientes) {
                System.out.println(paciente.getNome() + " " + paciente.getCpf() + " " + paciente.getSexo() + " " + paciente.getIdade()
                + " " + paciente.getPeso() + " " +  paciente.getAltura() + " \n" );
            }
        }
    }
}
