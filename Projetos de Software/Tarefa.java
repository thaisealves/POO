import java.util.ArrayList;
import java.util.List;

enum Status {
    PENDENTE, EM_ANDAMENTO, CONCLUIDA
}

public class Tarefa implements Gerenciavel {
    private String titulo;
    private String descricao;
    private Status status;
    private Desenvolvedor responsavel;
    private List<Dependencia> dependencias;

    public Tarefa(String titulo, String descricao, Desenvolvedor responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
        this.responsavel = responsavel;
        this.dependencias = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResponsavel(Desenvolvedor responsavel) {
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Desenvolvedor getResponsavel() {
        return responsavel;
    }

    public Status getStatus() {
        return status;
    }

    public List<Dependencia> getDependencias() {
        return dependencias;
    }

    public void adicionarDependente(Dependencia dep) {
        this.dependencias.add(dep);
    }

    public void removerDependente(Dependencia dep) {
        this.dependencias.remove(dep);
    }

    public void setStatus(Status status) {
        if (status == Status.EM_ANDAMENTO || status == Status.CONCLUIDA) {
            for (Dependencia dependencia : this.dependencias) {
                if (dependencia.getProxima() == this && !dependencia.podeIniciarProxima()) {
                    System.out.println("Não é possível alterar o status de " + this.titulo + ". A tarefa "
                            + dependencia.getAnterior().getTitulo() + " ainda não está concluída.");
                    return;
                }
            }
        }
        this.status = status;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Dependências da tarefa " + this.titulo + ":");
        for (Dependencia dependencia : this.dependencias) {
            System.out.println("  - Tarefa Anterior: " + dependencia.getAnterior().getTitulo() + ", Tarefa Próxima: "
                    + dependencia.getProxima().getTitulo());
        }
        System.out.println("Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", responsavel=" + responsavel +
                ", tarefasDependentes=" + dependencias +
                '}');
    }
}
