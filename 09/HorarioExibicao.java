import java.time.LocalTime;

public class HorarioExibicao {
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    public HorarioExibicao(String diaSemana, String horaInicio) {
        this.diaSemana = diaSemana;
        this.horaInicio = LocalTime.parse(horaInicio + ":00"); // adicionando os segundos pq depois eu quero pegar o
                                                               // tempo de duração em segundos da minha propaganda e
                                                               // então setar o horário de termino
    }

    public void calcularHorarioTermino(int duracaoEmSegundos) {
        this.horaFim = this.horaInicio.plusSeconds(duracaoEmSegundos);
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHorarioTermino(LocalTime horarioTermino) {
        this.horaFim = horarioTermino;
    }
}
