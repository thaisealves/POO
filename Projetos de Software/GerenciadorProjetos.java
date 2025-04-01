import java.util.List;

public class GerenciadorProjetos {
    private List<Projeto> projetos;
    private List<Desenvolvedor> desenvolvedores;

    public GerenciadorProjetos(List<Projeto> proj, List<Desenvolvedor> dev) {
        this.projetos = proj;
        this.desenvolvedores = dev;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void exibirStatusProjeto(Projeto projeto) {
        System.out.println("Status das tarefas do projeto: " + projeto.getNome());
        for (Tarefa tarefa : projeto.getTarefas()) {
            System.out.println("  - " + tarefa.getTitulo() + ": " + tarefa.getStatus());
        }
    }
}
