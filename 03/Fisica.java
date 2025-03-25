public class Fisica extends Pessoa {
    private String cpf;

    public Fisica() {
        this.cpf = "";
    }

    public Fisica(String cpf, String nome, String email, String telefone, int idade) {
        super(nome, email, telefone, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("CPF: " + this.cpf);
    }

    public static void main(String[] args) {

        Fisica pessoaFisica = new Fisica("111.111.111-11", "joao", "joao@gmail.com", "99178-9083", 12);
        pessoaFisica.imprimirInfos();
    }
}