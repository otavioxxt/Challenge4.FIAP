package br.com.fiap.main.teste;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
public class TesteConexao {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection cn = new ConexaoFactory().conexao();

        System.out.println("Conectado com sucesso!");

        cn.close();

    }
}
