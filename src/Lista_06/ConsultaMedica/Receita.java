package Lista_06.ConsultaMedica;

import java.util.List;

public class Receita {

    private static Integer superID = 0;
    private Integer id;
    private String medico;
    private List<Remedio> remedios;
    private String identificador;

    public String setIdentificador(List<Remedio> remedios) {
        for (Remedio remedio: remedios) {
            if (remedio.getIsControlado()) {
                return "Controlada";
            }
        } return  "Não controlada";
    }

    public Receita(String medico, List<Remedio> remedios) {
        superID++;
        this.id = superID;
        this.medico = medico;
        this.remedios = remedios;
        this.identificador = setIdentificador(remedios);
    }

    @Override
    public String toString() {
        return "Receita " + identificador + " número " + id + ": \n" + remedios();
    }

    private StringBuilder remedios() {
        StringBuilder remedioString = new StringBuilder();
        for (Remedio remedio : this.remedios) {
            remedioString.append(remedio.getNome()).append("\n");
        }
        return remedioString;
    }
}