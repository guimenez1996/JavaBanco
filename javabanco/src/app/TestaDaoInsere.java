package app;

import dao.ContatoDao;
import model.Contato;

import java.sql.SQLException;
import java.util.Scanner;

public class TestaDaoInsere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Contato contato = new Contato();
        contato.setNome("Maria");
        contato.setEmail("maria@gmail.com");
        contato.setEndereco("Rua toneleiro");

        try {
            ContatoDao dao = new ContatoDao();
            dao.adiciona(contato);
            System.out.println("Gravação feita no banco");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
