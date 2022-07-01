package Lista_06.ConsultaMedica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Utilidades {


        public static String validaConvenio(Scanner scanner) {
            while (true) {
                String convenio = scanner.nextLine();
                if (convenio.isBlank()) {
                    return "Sem convênio";
                } else {
                    try {
                        Long convenioLong = Long.parseLong(convenio);
                        return convenio;
                    } catch (NumberFormatException e) {
                        System.out.println("Digite o número de sua carteira, ou não digite nada e aperte enter");
                    }
                }
            }
        }

        public static Integer validaMedico(Scanner scanner) {
            Boolean isInvalid = true;
            Integer diaInteger = null;
            while (isInvalid) {
                String dia = scanner.next();
                switch (dia) {
                    case "1", "2", "3" -> {
                        diaInteger = Integer.parseInt(dia);
                        isInvalid = false;
                    }
                    default -> System.out.println("Escolha 1, 2 ou 3");
                }
            }
            return diaInteger;
        }

        public static Integer validaTurno(Scanner scanner) {
            Boolean isInvalid = true;
            Integer diaInteger = null;
            while (isInvalid) {
                String dia = scanner.next();
                switch (dia) {
                    case "1", "2" -> {
                        diaInteger = Integer.parseInt(dia);
                        isInvalid = false;
                    }
                    default -> System.out.println("Escolha 1 ou 2");
                }
            }
            return diaInteger;
        }

        public static Medico retornaMedico(Integer dia, Integer turno) {
            Medico medico = null;
            switch (dia) {
                case 1 -> medico = (turno == 1) ? Medico.SEGUNDADEMANHA : Medico.SEGUNDADETARDE;
                case 2 -> medico = (turno == 1) ? Medico.QUARTADEMANHA : Medico.QUARTADETARDE;
                case 3 -> medico = (turno == 1) ? Medico.SEXTADEMANHA : Medico.SEXTADETARDE;
            }
            return medico;
        }

        public static List<Remedio> retornaRemedios(Medico medico) {
            HashMap<Integer, Remedio> opcoes = Repository.remedios;
            List<Remedio> remedios = new ArrayList<>();
            switch (medico) {
                case SEGUNDADEMANHA -> { remedios.add(opcoes.get(1));
                    remedios.add(opcoes.get(5)); }
                case SEGUNDADETARDE -> remedios.add(opcoes.get(2));
                case QUARTADEMANHA -> remedios.add(opcoes.get(3));
                case QUARTADETARDE -> remedios.add(opcoes.get(6));
                case SEXTADEMANHA -> { remedios.add(opcoes.get(3));
                    remedios.add(opcoes.get(6));}
                case SEXTADETARDE -> remedios.add(opcoes.get(4));
            }
            return remedios;
        }

}
