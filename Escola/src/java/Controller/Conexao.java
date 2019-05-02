package Controller;

import java.sql.*;

public class Conexao {

    public static Connection getConexao() throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/prova";
        String usuario = "root";
        String senha = "mysqlfatec";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, usuario, senha);

        return conn;
    }

}