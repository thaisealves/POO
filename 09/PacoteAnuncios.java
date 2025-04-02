import java.util.ArrayList;
import java.util.List;

public class PacoteAnuncios implements Exibivel {
    private String nome;
    private float valor;
    private List<Propaganda> propagandas;

    public PacoteAnuncios(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        this.propagandas = new ArrayList<>();
    }

    public void adicionaPropaganda(Propaganda p) {
        this.propagandas.add(p);
    }

    public void removePropaganda(Propaganda p) {
        this.propagandas.remove(p);
    }

    @Override
    public void exibir() {
        System.out.println("PACOTE DE ANUNCIOS::::");
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);
    }
}