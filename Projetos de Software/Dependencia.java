public class Dependencia {
    private Tarefa anterior;
    private Tarefa proxima;

    public Dependencia(Tarefa anterior, Tarefa proxima) {
        this.anterior = anterior;
        this.proxima = proxima;
    }

    public Tarefa getAnterior() {
        return anterior;
    }

    public Tarefa getProxima() {
        return proxima;
    }

    public boolean podeIniciarProxima() {
        return anterior.getStatus() == Status.CONCLUIDA;
    }
}
