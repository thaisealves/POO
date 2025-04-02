public class Institucional extends Propaganda {
    public Institucional(String titulo, String descricao, int duracao, Cliente cliente) {
        super(titulo, descricao, duracao, cliente);
    }

    @Override
    public void exibir() {
        System.out.println("INSTITUCIONAL::");
        super.exibir();
    }

}
