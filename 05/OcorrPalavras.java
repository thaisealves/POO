import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OcorrPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase para pegar a contagem de palavras: ");
        String frase = scan.nextLine();
        String[] palavras = frase.split(" ");
        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }

        // atenção: pra aparecer apenas uma palavra tenho que imprimir atraves do set
        // das chaves
        // ao invés do array em si de palavras
        for (String palavra : contagem.keySet()) {
            System.out.println(palavra + ": " + contagem.get(palavra));
        }
        // outra forma de remover o leak de memoria sem usar o try
        scan.close();
    }
}
