package orm.actions;

import orm.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscaTarefas {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        String sql = "Select t from tarefa as t where t.finalizado = :paramFinalizado";

        //JPQL: classe Query de "Javax.persistence"
        Query query = manager.createQuery(sql);
        query.setParameter("paramFinalizado", true);

        //Mostrando o resultado

        List<Tarefa> listaTarefas = query.getResultList();

        for (Tarefa tarefa: listaTarefas
             ) {
            System.out.println(tarefa.getDescricao());
        }




    }
}
