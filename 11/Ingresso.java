public class Ingresso {
    private int id;
    private static int proximoId = 1;
    private Evento evento;

    public Ingresso(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("O ingresso deve estar associado a um evento e um participante.");
        }
        this.evento = evento;
        this.id = proximoId++;

    }

    public Evento getEvento() {
        return evento;
    }

    public int getId() {
        return id;
    }

}
