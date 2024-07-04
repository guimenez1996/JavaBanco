package app;

import javabanco.ConncetionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsere {
    public static void main(String[] args) {
        try {
            String sql = "Insert into contatos(nome, email, endereco) values (?,?,?)";
            Connection con = ConncetionFactory.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "Clayton");
            stmt.setString(2, "guilherme.senacads@gmail.com");
            stmt.setString(3, "Rua: Fernando Mendes, 18");

            stmt.execute();
            System.out.println("Gravação feita com sucesso");
            stmt.close();
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
