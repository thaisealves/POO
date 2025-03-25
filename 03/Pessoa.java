public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa() {
        this.nome = "Desconhecido";
        this.email = "";
        this.idade = 0;
        this.telefone = "";

    }

    public Pessoa(String nome, String email, String telefone, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
        else
            System.out.println("Idade invalida");
    }

    public void imprimirInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("email: " + this.email);
        System.out.println("telefone: " + this.telefone);
    }

    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa("joao", "joao@gmail.com", "99178-9083", 12);
        novaPessoa.imprimirInfos();
    }
}
