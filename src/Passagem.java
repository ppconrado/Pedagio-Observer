import java.time.LocalDateTime;

public class Passagem {
    private String codigoTag;
    private LocalDateTime horario;
    private String placa;
    private String codigoPraca;
    private double valor;

    public Passagem(String codigoTag, LocalDateTime horario,
                    String placa, String codigoPraca, double valor) {
        this.codigoTag = codigoTag;
        this.horario = horario;
        this.placa = placa;
        this.codigoPraca = codigoPraca;
        this.valor = valor;
    }

    public String getCodigoTag() { return codigoTag; }
    public LocalDateTime getHorario() { return horario; }
    public String getPlaca() { return placa; }
    public String getCodigoPraca() { return codigoPraca; }
    public double getValor() { return valor; }
}