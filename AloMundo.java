import java.util.Scanner;

class AloMundo {
    public static void main(String[] args) {
        System.out.println("Alo mundo");
    }
}

class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, base;
        float area;
        System.out.print("Informe a altura:");
        altura = teclado.nextInt();
        System.out.print("Informe a base:");
        base = teclado.nextInt();
        area = (base * altura) / 2;
        System.out.print(area);
    }
}
