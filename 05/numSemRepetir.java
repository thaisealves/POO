import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class numSemRepetir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase para pegar palavras únicas: ");
        String frase = scan.nextLine();

        Set<String> palavrasUnicas = new HashSet<>(Arrays.asList(frase.split(" ")));
        System.out.println("quantidade de palavras unicas: " + palavrasUnicas.size());

        // outra forma de remover o leak de memoria sem usar o try
        scan.close();
    }
}
