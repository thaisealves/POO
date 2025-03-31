import java.util.List;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        Animal animal1 = new Animal("Luna", "Cachorro", 12, cliente1);
        Animal animal2 = new Animal("Thor", "Lagarto", 1, cliente1);
        List<Animal> animais = List.of(animal1, animal2);

        Veterinario vet = new Veterinario("Hugo", "Gato", "234578");
        Veterinario vet2 = new Veterinario("João", "Silvestres", "9187367");

        Consulta consulta1 = new Consulta();

        consulta1.realizarServico(vet);
        vet.atender(animal1);
        vet2.atender(animal2); 
    }
}