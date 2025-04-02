public class Main {
    // fazer aqui a classe main rodando tudo
    public static void main(String[] args) {
        // clientes
        Cliente cliente1 = new Cliente("Cliente 1", "11111111121", "Juiz de Fora");
        Cliente cliente3 = new Cliente("Cliente 3", "11111111141", "Sao paulo");

        // propagandas
        Comercial comercial = new Comercial("Comercial", "propaganda comercial", 10, cliente1);
        Institucional institucional = new Institucional("Institucional", "Propaganda institucional", 5, cliente3);
        Promocional promo = new Promocional("Promocional", "Propaganda promocional", 30, cliente3);

        // horarios
        HorarioExibicao hora1 = new HorarioExibicao("segunda", "15:00");
        HorarioExibicao hora2 = new HorarioExibicao("quarta", "10:00");

        // adicionar os horarios de exibição às propagandas

        comercial.adicionaHorarios(null);
        // adicionando propagandas pra retorno financeiro
        PacoteAnuncios pacoteFinanceiro = new PacoteAnuncios("Financeiros", 10);
        pacoteFinanceiro.adicionaPropaganda(promo);
        pacoteFinanceiro.adicionaPropaganda(comercial);

        // adicionando propaganda institucional
        PacoteAnuncios pacoteEducacional = new PacoteAnuncios("Educacional", 5);
        pacoteEducacional.adicionaPropaganda(institucional);

        // criar uma estação de tv

    }
}
