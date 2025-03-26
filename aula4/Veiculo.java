public class Veiculo {
    private String modelo;
    private String placa;
    static private int qntEstacionados = 0;

    public Veiculo(String modelo, String placa) {
        qntEstacionados++;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public static int getQntEstacionados() {
        return qntEstacionados;
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("carro", "876-RTVT");
        Veiculo moto = new Veiculo("moto", "0981-HRGN");

        System.out.println("A quantidade de veículos estacionados é: " + getQntEstacionados());
    }
}
