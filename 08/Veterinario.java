public class Veterinario {
    private String nome;
    private String especialidade;
    private String crmv;

    public Veterinario(String nome, String especialidade, String crmv) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void atender(Animal animal) {
        System.out.println("O veterinario " + this.nome + " está atendendo o animal " + animal.getNome());
    }
}
