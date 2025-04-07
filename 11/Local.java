public class Local {
    private String nome;
    private String endereco;

    public Local(String nome, String endereco) {
        if (nome == null || nome.trim().isEmpty() || endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome e o endereço do local não podem ser nulos ou vazios.");
        }
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
