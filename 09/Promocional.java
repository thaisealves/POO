public class Promocional extends Propaganda {
    public Promocional(String titulo, String descricao, int duracao, Cliente cliente) {
            super(titulo, descricao, duracao, cliente);
        }
    
        @Override
    public void exibir() {
        System.out.println("Promocionalll: ");
        super.exibir();
    }

}
