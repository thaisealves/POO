public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica() {
        this.cnpj = "";
    }

    public Juridica(String nome, String email, String telefone, int idade, String cnpj) {
        super(nome, email, telefone, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("CNPJ: " + this.cnpj);
    }

    public static void main(String[] args) {

        Juridica pessoaJuridica = new Juridica("joao", "joao@gmail.com", "99178-9083", 12, "11.1111.111/1111");
        pessoaJuridica.imprimirInfos();
    }
}
