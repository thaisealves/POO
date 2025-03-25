public class ContaBancaria {
    private double saldo;
    private Pessoa titular;

    public ContaBancaria() {
        this.saldo = 0;
        this.titular = new Pessoa();
    }

    public ContaBancaria(double saldo, Pessoa pessoa1) {
        this.saldo = saldo;
        this.titular = pessoa1;
    }

    public void depositar(double valor) {
        if (valor >= 0)
            saldo += valor;
        else
            System.out.println("Num da pra depositar negativo ne");
    }

    public void sacar(double valor) {
        if (valor <= this.saldo)
            saldo -= valor;
        else
            System.out.println("Voce ta tentando sacar mais do que você tem");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void exibirInfos() {
        System.out.println("Titular::: ");
        titular.imprimirInfos();
        System.out.println("Saldo atual: " + saldo);
    }
}
