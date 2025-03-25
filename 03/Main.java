public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("123.456.789-00", "Ana", "ana@email.com", "555-1234", 28);

        Juridica pessoaJuridica = new Juridica("Empresa X", "empresa@email.com", "99956780", 10, "12.345.678/0001-90");

        ContaBancaria conta1 = new ContaBancaria(1000, pessoaFisica);
        ContaBancaria conta2 = new ContaBancaria(5000.0, pessoaJuridica);

        conta1.exibirInfos();
        conta2.exibirInfos();
    }
}
