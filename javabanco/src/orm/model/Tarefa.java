package orm.model;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String descricao;

    private boolean finalizada;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_finalizado")
    private Calendar dataFinalizacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
}
