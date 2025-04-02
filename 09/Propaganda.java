import java.util.ArrayList;
import java.util.List;

abstract class Propaganda implements Exibivel {
    private String titulo;
    private String descricao;
    private int duracao;
    private Cliente cliente;
    private List<HorarioExibicao> horarioExibicoes;

    public Propaganda(String titulo, String descricao, int duracao, Cliente cliente) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.duracao = duracao;
        this.titulo = titulo;
        this.horarioExibicoes = new ArrayList<>();
    }

    public void adicionaHorarios(HorarioExibicao horario) {
        this.horarioExibicoes.add(horario);
        if (horario != null) {
            horario.calcularHorarioTermino(this.duracao);
        }
    }

    public void removeHorario(HorarioExibicao h) {
        this.horarioExibicoes.remove(h);
    }

    @Override
    public void exibir() {
        System.out.println("PROPAGANDA:::");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Segundos de duração: " + this.duracao + "s");
        System.out.println("Cliente associado: " + this.cliente.getNome());
    }
}
