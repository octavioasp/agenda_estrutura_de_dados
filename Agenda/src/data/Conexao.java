package data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    private static Connection conexao;

    public Conexao() {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/agenda?user=postgres&password=123";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conectado!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro " + erro.getMessage(), "Conexão", 3);
        }

    }

    

    public Connection getConexao() {

        return conexao;
    }
}
