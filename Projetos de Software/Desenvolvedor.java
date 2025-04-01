public class Desenvolvedor {
    private String nome;
    private String email;
    private String espec;

    public Desenvolvedor(String nome, String email, String espec) {
        this.nome = nome;
        this.email = email;
        this.espec = espec;
    }

    // public void setNome(String nome) {
    // this.nome = nome;
    // }

    public String getNome() {
        return this.nome;
    }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public String getEmail() {
        return this.email;
    }

    // public void setEspec(String espec) {
    //     this.espec = espec;
    // }

    public String getEspec() {
        return this.espec;
    }

    // @Override
    // public void exibirDetalhes() {
    // System.out.println(
    // "Desenvolvedor{" +
    // "nome='" + this.nome + '\'' +
    // ", email='" + this.email + '\'' +
    // ", especializacao='" + this.espec + '\'' +
    // ", responsabilidades=" + this.responsabilidades +
    // '}');
    // }
}
