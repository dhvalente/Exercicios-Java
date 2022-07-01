package Lista_06.ControleDeTrafego;

public class Aeronave {

    String matricula;
    String cor;
    String modelo;
    boolean estaPousando;

    public Aeronave() {

    }

    public String getMatricula() {
        return matricula;
    }

    public Aeronave(String matricula, String cor, String modelo) {
        this.matricula = matricula;
        this.cor = cor;
        this.modelo = modelo;
        this.estaPousando = false;
    }
}