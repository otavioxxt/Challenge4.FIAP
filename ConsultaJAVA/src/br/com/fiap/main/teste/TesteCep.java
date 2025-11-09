package br.com.fiap.main.teste;

import br.com.fiap.Services.CepService;
import br.com.fiap.beans.Hospital;

import javax.swing.*;
import java.io.IOException;

public class TesteCep {
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws IOException {
        CepService viaCep = new CepService();

        String cep = texto("CEP");

        Hospital hospital = viaCep.getHospital(cep);

        System.out.println(hospital);
    }

}
