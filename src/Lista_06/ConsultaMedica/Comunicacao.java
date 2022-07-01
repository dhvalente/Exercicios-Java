package Lista_06.ConsultaMedica;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Comunicacao {

    public static void marcaConsulta() {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();

        System.out.println("-------- BEM-VINDO A NOSSA CLÍNICA --------");

        System.out.println("Digite seu nome: ");
        String paciente = scanner.nextLine();

        System.out.println("Possui convênio? Se sim digite o número do cartão. Se não, digite enter: ");
        String cartao = Utilidades.validaConvenio(scanner);

        System.out.println("Digite 1 para segunda, 2 para quarta, 3 para sexta: ");
        Integer dia = Utilidades.validaMedico(scanner);

        System.out.println("Digite 1 para manhã, 2 para tarde: ");
        Integer turno = Utilidades.validaTurno(scanner);

        Medico medico = Utilidades.retornaMedico(dia, turno);
        List<Remedio> remedios = Utilidades.retornaRemedios(medico);

        Receita receita = new Receita(medico.getNome(), remedios);


        System.out.println("\n" + Repository.prescreveReceita(receita, paciente, cartao));
        System.out.println("\nObrigado pela preferência");



    }
}
