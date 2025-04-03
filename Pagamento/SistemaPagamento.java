public class SistemaPagamento {
    public void realizarPagamento(Pagamento pagamento, double valor) {
        pagamento.processarPagamento(valor);
        pagamento.gerarRecibo();
    }
}
