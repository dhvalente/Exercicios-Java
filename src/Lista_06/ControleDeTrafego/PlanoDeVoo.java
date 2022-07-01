package Lista_06.ControleDeTrafego;

public class PlanoDeVoo{

    Aeronave aeronaveMatricula;
    Integer horario;
    String localSaida;
    String localDestino;

    public PlanoDeVoo() {

    }

    public PlanoDeVoo(Aeronave aeronaveMatricula, Integer horario, String localSaida, String localDestino) {
        this.aeronaveMatricula = aeronaveMatricula;
        this.horario = horario;
        this.localSaida = localSaida;
        this.localDestino = localDestino;
    }
}