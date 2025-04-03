public class PagamentoBoleto extends Pagamento {
    @Override
    public void gerarRecibo() {
        System.out.println("Pago com boleto;");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagando com boleto no valor de: " + valor);
    }

}
