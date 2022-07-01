package Lista_06.ConsultaMedica;

public class Remedio {

    private String nome;
    private Boolean estaControlado;

    public Boolean getIsControlado() {
        return estaControlado;
    }

    public String getNome() {
        return nome;
    }

    public Remedio(String nome, Boolean estaControlado) {
        this.nome = nome;
        this.estaControlado = estaControlado;
    }
}