public class Funcionarios {
    private static int contratados = 0;

    public Funcionarios() {
        contratados++;
    }

    public static int qntContratados() {
        return contratados;
    }

    public static void main(String[] args) {

        Funcionarios f1 = new Funcionarios();
        Funcionarios f2 = new Funcionarios();
        Funcionarios f3 = new Funcionarios();

        System.out.println("A quantidade de funcionarios contratados é: " + Funcionarios.qntContratados());

    }
}
