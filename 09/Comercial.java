public class Comercial extends Propaganda {
    public Comercial(String titulo, String descricao, int duracao, Cliente cliente) {
        super(titulo, descricao, duracao, cliente);
    }

    @Override
    public void exibir() {
        System.out.println("COMERCIAL:");
        super.exibir();
    }
}
