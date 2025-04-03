public class PagamentoDinheiro extends Pagamento {
    @Override
    public void gerarRecibo() {
        System.out.println("Pago em dinheiro");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("pagando R$" + valor + " em dinheiro");
    }
}