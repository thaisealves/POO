import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Animal> animais;

    public Cliente(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAnimal(Animal animal) {
        animais.add(animal);

    }

}
