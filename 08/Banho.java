public class Banho implements Servico {
    @Override // colocando override pra mostrar que quero usar a implementação que tá aqui no
              // método
    public void realizarCobranca(Veterinario veterinario) {
        System.out.println("Banho cobrado $$$");
    }

    @Override
    public void realizarServico(Veterinario veterinario) {
        System.out.println("Banho dado");

    }

    @Override
    public void cancelarServico(Veterinario veterinario) {
        System.out.println("Banho cancelado :(");

    }
}
