package Lista_06.ConsultaMedica;

public enum Medico {

    SEGUNDADEMANHA(1, "Astrid Hannah"),
    SEGUNDADETARDE(2, "Norma Hans"),
    QUARTADEMANHA(3, "Paulo Rainer"),
    QUARTADETARDE(4, "Arthur Wolfang"),
    SEXTADEMANHA(5, "Hugo Souza"),
    SEXTADETARDE(6, "Jessica Valeska");


    private int identicador;
    private String nome;

    Medico(int identicador, String nome) {
    }

    String getNome() {
        return nome;
    }
}