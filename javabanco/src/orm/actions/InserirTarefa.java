package orm.actions;

import orm.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class InserirTarefa {
    //1. Instanciar e preencher os dados do JavaBeans
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar Java");
        tarefa.setFinalizada(true);
        tarefa.setDataFinalizacao(Calendar.getInstance());

        //2. Conectar ao operador do ORM/JPA
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        //3. Executar a operação

        manager.getTransaction().begin();
        //O "C" do CRUD é dado pelo método "persist" de Hibernate
        manager.persist(tarefa);
        manager.getTransaction().commit();

        System.out.println("Tarefa Inserida, ID " + tarefa.getId());
        manager.close();
        factory.close();
    }
}
