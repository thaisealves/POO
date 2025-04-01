import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto implements Gerenciavel {
    private String nome;
    private String descricao;
    private Date inicio;
    private Date termino;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao, Date inicio, Date termino) {
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = inicio;
        this.termino = termino;
        this.tarefas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public String getTermino() {
        return termino;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int index) {
        this.tarefas.remove(index);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void main(String[] args) {
        // Criar Desenvolvedores
        Desenvolvedor dev1 = new Desenvolvedor("João", "joao@email.com", "Back-end");
        Desenvolvedor dev2 = new Desenvolvedor("Maria", "maria@email.com", "Front-end");
        Desenvolvedor dev3 = new Desenvolvedor("José", "jose@email.com", "Banco de dados");

        // Criar Tarefas
        Tarefa tarefa1 = new Tarefa("Implementar API", "Implementar a API do sistema", dev1);
        Tarefa tarefa2 = new Tarefa("Criar Interface", "Criar a interface do usuário", dev2);
        Tarefa tarefa3 = new Tarefa("Criar Banco de dados", "Criar o banco de dados", dev3);
        Tarefa tarefa4 = new Tarefa("Testar Interface", "Testar a interface do usuário", dev2);

        // Criar Dependências
        Dependencia dependencia1 = new Dependencia(tarefa1, tarefa2);
        Dependencia dependencia2 = new Dependencia(tarefa2, tarefa4);
        Dependencia dependencia3 = new Dependencia(tarefa3, tarefa2);

        // Adicionar Dependências às Tarefas
        tarefa2.adicionarDependente(dependencia1);
        tarefa4.adicionarDependente(dependencia2);
        tarefa2.adicionarDependente(dependencia3);

        // Criar Projeto e Adicionar Tarefas
        Projeto projeto = new Projeto("Desenvolvimento de Sistema", "Desenvolver um sistema completo");
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);
        projeto.adicionarTarefa(tarefa3);
        projeto.adicionarTarefa(tarefa4);

        // Exibir Tarefas do Projeto
        projeto.exibirDetalhes();

        // Simular o progresso das tarefas
        System.out.println("\nSimulando progresso das tarefas:");
        tarefa1.setStatus(Status.CONCLUIDA);
        tarefa2.setStatus(Status.EM_ANDAMENTO);
        tarefa3.setStatus(Status.CONCLUIDA);
        tarefa2.setStatus(Status.CONCLUIDA);
        tarefa4.setStatus(Status.EM_ANDAMENTO);
        projeto.exibirDetalhes();

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tarefas do projeto " + this.nome + ":");
        for (Tarefa tarefa : this.tarefas) {
            tarefa.exibirDetalhes();
            System.out.println("---");
        }
    }

}
