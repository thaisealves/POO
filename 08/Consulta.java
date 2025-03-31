public class Consulta implements Servico {
    @Override
    public void realizarCobranca(Veterinario veterinario) {
        System.out.println("Cobrança feita $$$");
    }

    @Override
    public void realizarServico(Veterinario veterinario) {
        System.out.println("Consulta realizada por: " + veterinario.getNome() + veterinario.getEspecialidade());
    }

    @Override
    public void cancelarServico(Veterinario veterinario) {
        System.out.println("Consulta cancelada :(");

    }
    // eu PRECISO colocar o que tá na interface e eu posso colocar coisas a mais se
    // eu quiser ou precisar
    // minha clinica tem um padrão pra todo tipo de serviço pra saber o que usa em
    // comum, mas cada um pode ter sua peculiaridade

    int tempoGasto() {
        return 30;
    }
}
