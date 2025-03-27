import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraseInvertida {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String frase;
            String fraseInv = "";
            System.out.println("Digite uma bela frase: ");
            frase = scan.nextLine();
            String[] palavras = frase.split(" ");
            List<String> listFrase = new ArrayList<>();
            for (String palavra : palavras) {
                listFrase.add(palavra);
            }
            // ao invés de usar isso, posso usar Collections.reverse(listFrase)
            for (int i = listFrase.size() - 1; i >= 0; i--) {
                fraseInv += listFrase.get(i) + " ";
            }

            // essas duas formas funcionam
            System.out.println("Frase invertida: " + fraseInv);
            Collections.reverse(listFrase);
            String reverse = String.join(" ", listFrase);
            System.out.println("Com reverse: " + reverse);
        }
    }
}
