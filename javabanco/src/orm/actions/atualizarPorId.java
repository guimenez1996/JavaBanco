package orm.actions;

import orm.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class atualizarPorId {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setDescricao("Estudar Java até o fim!!");
        tarefa.setFinalizada(false);
        tarefa.setDataFinalizacao(null);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        //3. Opera Merge

        manager.getTransaction().begin();
        manager.merge(tarefa);
        manager.getTransaction().commit();

        System.out.println("Tarefa atualizada, ID: " + tarefa.getId());

        manager.close();
        factory.close();

    }
}
