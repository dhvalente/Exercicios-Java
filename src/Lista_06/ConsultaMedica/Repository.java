package Lista_06.ConsultaMedica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repository {
        public static HashMap<Integer, Remedio> remedios = new HashMap<>();
        private static List<Receita> receitas = new ArrayList<>();

        public static void populateRemedios() {
            Remedio remedio1 = new Remedio("Flurbiprofeno", true);
            Remedio remedio2 = new Remedio("Celestrat", false);
            Remedio remedio3 = new Remedio("Betametasona", false);
            Remedio remedio4 = new Remedio("Dicoflenaco Potássico", true);
            Remedio remedio5 = new Remedio("Soro Fisiologico", true);
            Remedio remedio6 = new Remedio("Neusa", false);
            remedios.put(1, remedio1);
            remedios.put(2, remedio2);
            remedios.put(3, remedio3);
            remedios.put(4, remedio4);
            remedios.put(5, remedio5);
            remedios.put(6, remedio6);
        }

        public static String prescreveReceita(Receita receita, String paciente, String convenio) {
            receitas.add(receita);
            return "Paciente: " + paciente + "\nConvênio: " + convenio +  "\n\n" + receita.toString();
        }

}
