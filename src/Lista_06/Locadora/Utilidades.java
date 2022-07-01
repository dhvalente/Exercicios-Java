package Lista_06.Locadora;

import java.util.Scanner;

public class Utilidades {
    public static String validaGenero(Scanner scanner) {
        Boolean isInvalid = true;
        String genero = null;
        while (isInvalid) {
            genero = scanner.next();
            switch (genero) {
                case "AVENTURA", "ACAO", "COMEDIA", "ROMANCE", "DRAMA", "FICCAO_CIENTIFICA", "FANTASIA" -> isInvalid = false;
                default -> System.out.println("Escolha inválida!");
            }
        }
        return genero;
    }

    public static String validaFaixaEtaria(Scanner scanner) {
        Boolean isInvalid = true;
        String faixaEtaria = null;
        while (isInvalid) {
            faixaEtaria = scanner.next();
            switch (faixaEtaria) {
                case "G", "PG_13", "PG_17", "R", "X" -> isInvalid = false;
                default -> System.out.println("Escolha inválida!");
            }
        }
        return faixaEtaria;
    }

    public static Long validaCpf(Scanner scanner) {
        Long cpfNumber;
        while (true) {
            String cpf = scanner.next();
            if (cpf.length() != 11) {
                System.out.println("Cpf deve ter 11 dígitos!");
            } else {
                try {
                    cpfNumber = Long.parseLong(cpf);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Somente números!");
                }
            }

        }
        return cpfNumber;
    }

    public static Filme validaLocacao(Scanner scanner) {
        Repository repository = new Repository();
        while (true) {
            String numeroDaFita = scanner.next();
            try {
                if (repository.resgataFilme(Integer.parseInt(numeroDaFita)) == null) {
                    System.out.println("Fita não encontrada!");
                } else {
                    return repository.resgataFilme(Integer.parseInt(numeroDaFita));
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número!");
            }
        }

    }
}
