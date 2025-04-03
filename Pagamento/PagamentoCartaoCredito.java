public class PagamentoCartaoCredito extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagando com cartão de crédito no valor de:" + valor);
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Pago com cartao");
    }

}
