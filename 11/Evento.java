import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int capacidade;
    private String tipo;
    private List<Participante> participantes;
    private Local local;
    private List<Ingresso> ingressos;

    public Evento(int capacidade, String tipo, Local local) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade do evento deve ser maior que zero.");
        }
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.local = local;
        this.participantes = new ArrayList<>();
        this.ingressos = new ArrayList<>();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public Local getLocal() {
        return local;
    }

    public void addParticipante(Participante p) {
        if (participantes.size() >= capacidade) {
            throw new IllegalStateException("A capacidade máxima de participantes foi atingida.");
        }
        participantes.add(p);
    }

    public void removeParticipante(Participante p) {
        participantes.remove(p);
    }

    public void listaParticipantes() {
        for (Participante p : participantes) {
            System.out.println(p.getNome());
        }
    }

    public void registrarVenda(Ingresso ingresso, Participante participante) {
        if (ingressos.size() >= capacidade) {
            throw new IllegalStateException("Não há mais ingressos disponíveis para este evento.");
        }
        if (ingresso.getEvento() != this) {
            throw new IllegalArgumentException("Este ingresso não pertence a este evento.");
        }
        this.ingressos.add(ingresso);
        participante.setIngresso(ingresso);
        if (!this.participantes.contains(participante)) {
            try {
                addParticipante(participante);
            } catch (IllegalStateException e) {
                System.err.println("Erro ao adicionar participante via venda de ingresso: " + e.getMessage());
            }
        }
        participante.setIngresso(ingresso);
    }

    public int getIngressosVendidos() {
        return this.ingressos.size();
    }

    public int getVagasDisp() {
        return this.capacidade - getIngressosVendidos();
    }

    public void demonstrarVendas() {
        int vendidos = getIngressosVendidos();
        int disponiveis = getVagasDisp();
        System.out.println("--- Informações de Vendas do Evento: " + this.tipo + " ---");
        System.out.println("Ingressos Vendidos: " + vendidos);
        System.out.println("Capacidade Total: " + this.capacidade);
        System.out.println("Vagas Disponíveis: " + disponiveis);
        System.out.println("-----------------------------------------------------");
    }

}
