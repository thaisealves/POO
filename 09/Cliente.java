import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cnpj;
    private String endereco;
    private List<Propaganda> propagandas;

    public Cliente(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.propagandas = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    

    public void adicionaPropaganda(Propaganda p) {
        this.propagandas.add(p);
    }

    public void removePropaganda(Propaganda p) {
        this.propagandas.remove(p);
    }
}