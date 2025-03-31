public class Cirurgia implements Servico {

    @Override
    public void realizarServico(Veterinario veterinario) {
        System.out.println("Cirurgia realizada");
    }

    @Override
    public void cancelarServico(Veterinario veterinario) {
        System.out.println("Cirurgia cancelada");
    }

    @Override
    public void realizarCobranca(Veterinario veterinario) {
        System.out.println("Cirurgia cobrada");
    }

}
