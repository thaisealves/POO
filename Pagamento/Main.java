public class Main {
    public static void main(String[] args) {
        PagamentoBoleto pagBoleto = new PagamentoBoleto();
        PagamentoCartaoCredito pagCartao = new PagamentoCartaoCredito();
        PagamentoPix pagPix = new PagamentoPix();
        PagamentoDinheiro pagDin = new PagamentoDinheiro();

        SistemaPagamento sistema = new SistemaPagamento();

        sistema.realizarPagamento(pagCartao, 200);
        sistema.realizarPagamento(pagPix, 400);
        sistema.realizarPagamento(pagDin, 20);
        sistema.realizarPagamento(pagBoleto, 100);
    }
}
