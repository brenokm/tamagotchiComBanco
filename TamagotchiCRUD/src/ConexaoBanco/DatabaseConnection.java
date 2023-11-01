package ConexaoBanco;

import Classes.Tamago;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DatabaseConnection {
    //Colocar o nome do banco de dados que você criou
    private static final String URL = "jdbc:mysql://192.168.10.129:3306/tamagotchi";
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

    public void create(Tamago tamago) {
        // Query SQL para inserção.
        String query = "INSERT INTO tamago (nome_tamago, tipo_tamago, level_tamago, idade_tamago, energia_tamago, saude_tamago, fome_tamago, estadoM_tamago, higiene_tamago, sono_tamago) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = GetConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, tamago.getNome_tamago());
            stmt.setString(2, tamago.getTipo_tamago());
            stmt.setInt(3, 1);
            stmt.setInt(4, 1);
            stmt.setInt(5, 50);
            stmt.setInt(6, 50);
            stmt.setInt(7, 50);
            stmt.setInt(8, 50);
            stmt.setInt(9, 50);
            stmt.setInt(10, 50);


            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Tamago> readAll() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Tamago> tamagos = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM tamago";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = GetConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                tamagos.add(new Tamago(rs.getInt("id_tamago"),rs.getString("nome_tamago"), rs.getString("tipo_tamago"), rs.getInt("level_tamago"),rs.getInt("idade_tamago"),rs.getInt("energia_tamago"),rs.getInt("saude_tamago"),rs.getInt("fome_tamago"),rs.getInt("estadoM_tamago"),rs.getInt("higiene_tamago"),rs.getInt("sono_tamago")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return tamagos;
    }
    
      public void update(Tamago tamago, int id) {
        // Query SQL para atualização.
        String query = "UPDATE tamago SET nome_tamago = ?, tipo_tamago = ?, level_tamago = ? , idade_tamago = ?, energia_tamago = ?, saude_tamago = ? , fome_tamago = ? , estadoM_tamago = ?, higiene_tamago = ?, sono_tamago = ? WHERE id_tamago = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = GetConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, tamago.getNome_tamago());
            stmt.setString(2, tamago.getTipo_tamago());
            stmt.setInt(3, tamago.getLevel_tamago());
            stmt.setInt(4, tamago.getIdade_tamago());
            stmt.setInt(5, tamago.getEnergia_tamago());
            stmt.setInt(6, tamago.getSaude_tamago());
            stmt.setInt(7, tamago.getFome_tamago());
            stmt.setInt(8, tamago.getEstadoM_tamago());
            stmt.setInt(9, tamago.getHigiene_tamago());
            stmt.setInt(10, tamago.getSono_tamago());
            stmt.setInt(11, tamago.getId_tamago());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
      
      public void delete (int id){
        String query = "DELETE FROM tamago WHERE id_tamago = ?";
        try(
                Connection conn = GetConnection();
                PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1,id);
            stmt.execute();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}