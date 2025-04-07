public class Main {
    public static void main(String[] args) {
        try {
            Local local = new Local("Centro de Convenções", "Rua Principal, 123");
            Evento evento = new Evento(2, "Conferência de Tecnologia", local);

            Participante p1 = new Participante("João Silva", "joao.silva@email.com");
            Participante p2 = new Participante("Maria Oliveira", "maria.oliveira@outroemail.com");
            Participante p3 = new Participante("Carlos Pereira", "carlos.pereira@maisumemail.com");

            Ingresso ingresso1 = new Ingresso(evento);
            evento.registrarVenda(ingresso1, p1);

            Ingresso ingresso2 = new Ingresso(evento);
            evento.registrarVenda(ingresso2, p2);

            Ingresso ingresso3 = new Ingresso(evento); // Tentativa de vender mais ingressos que a capacidade
            try {
                evento.registrarVenda(ingresso3, p3);
            } catch (IllegalStateException e) {
                System.err.println("Erro ao registrar venda do terceiro ingresso: " + e.getMessage());
            }
            
            evento.demonstrarVendas();
            System.out.println("\nLista de Participantes:");
            evento.listaParticipantes();

            // Exemplo de tentar adicionar mais participantes que a capacidade diretamente
            try {
                evento.addParticipante(new Participante("Ana Souza", "ana.souza@email.com"));
            } catch (IllegalStateException e) {
                System.err.println("\nErro ao adicionar participante: " + e.getMessage());
            }

            // Exemplo de tentar criar um evento com capacidade inválida
            try {
                Evento eventoInvalido = new Evento(0, "Evento Teste", local);
            } catch (IllegalArgumentException e) {
                System.err.println("\nErro ao criar evento: " + e.getMessage());
            }

            // Exemplo de tentar criar um participante com email inválido
            try {
                Participante participanteInvalido = new Participante("José Santos", "email_invalido");
            } catch (IllegalArgumentException e) {
                System.err.println("\nErro ao criar participante: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Erro de argumento no main: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Erro de estado no main: " + e.getMessage());
        }
    }
}