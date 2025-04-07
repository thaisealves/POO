public class Participante {
    private String nome;
    private Ingresso ingresso;
    private String email;

    public Participante(String nome, String email) {
        this(nome, null, email);
    }

    public Participante(String nome, Ingresso ingresso, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do participante não pode ser nulo ou vazio.");
        }
        if (email == null || !email.matches("[^@]+@[^@]+\\.[^@]+")) {
            throw new IllegalArgumentException("O email do participante deve ser válido.");
        }
        this.email = email;
        this.nome = nome;
        this.ingresso = ingresso;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }
    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
}
