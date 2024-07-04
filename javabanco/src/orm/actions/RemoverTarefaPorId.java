package orm.actions;

import orm.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverTarefaPorId {
    public static void main(String[] args) {
        //1. Conectar ao operador do ORM/JPA
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        //2. Buscar o objeto a ser excluído

        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa = manager.find(Tarefa.class, tarefa.getId());

        //3. operar com "Remove"

        //3. Executar a operação

        manager.getTransaction().begin();
        manager.persist(tarefa);
        manager.getTransaction().commit();
        System.out.println("Tarefa excluída");

        manager.close();
        factory.close();
    }
}
