import java.util.Scanner;

class MenosMoedas {
    public static void main(String[] args) {
        int[] moedas = { 100, 50, 25, 10, 5, 1 };
        int[] qntMoedas = { 0, 0, 0, 0, 0, 0 };
        int centavos;
        //usando o try para nao ter memory leak, quando usa o recurso tem que fechar quando para de usar, o try with resources meio que fecha sozinho.
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Digite o valor em centavos: ");
            centavos = teclado.nextInt();
            for (int i = 0; i < moedas.length; i++) {
                qntMoedas[i] = centavos / moedas[i];
                centavos = centavos % moedas[i];
                System.out.println(qntMoedas[i] + " Moedas de " + moedas[i] + " centavos");

            }
        }

    }
}
