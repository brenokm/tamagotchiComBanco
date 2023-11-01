package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DatabaseConnection {
    //Colocar o nome do banco de dados que você criou
    private static final String URL = "jdbc:mysql://192.168.10.129:3306/tamagotchil";
    //Colocar o usuario que loga no MySQL Workbench
    private static final String USER = "bpassos";
    //Colocar a senha que loga no MySQL Workbench
    private static final String PASSWORD = "root";

    //Método que faz a conexão com o banco de dados
    public static Connection GetConnection() {
        try {
            //Classe importada para usar o banco, sempre será usado no JAVA
            System.out.println("Funcionou");        
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Deu merda");
            throw new RuntimeException(e);
        }
        finally {
            
        }
    }

}