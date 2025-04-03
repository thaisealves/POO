public class PagamentoPix extends Pagamento {
    @Override
    public void gerarRecibo() {
        System.out.println("Pago por Puix");
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("pagando R$" + valor + " via pix");
    }
}
