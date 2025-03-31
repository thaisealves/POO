public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade, Cliente cliente) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        cliente.adicionaAnimal(this); // o cliente que to recebendo do contrutor eu adiciono na lista de animais dele
                                      // o proprio animal que to criando aq 
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
