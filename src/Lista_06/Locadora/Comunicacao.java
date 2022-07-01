package Lista_06.Locadora;

import java.util.Scanner;

public class Comunicacao {
    static void Menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------- SEJA BEM-VINDO A NOSSA LOCADORA! ---------");
        Integer opcao = 0;
        while (opcao != 1 && opcao != 2) {
            System.out.println("Você deseja: \n1 - Cadastrar uma fita \n2 - Alugar um filme");
            try {
                opcao = sc.nextInt();
                if (opcao == 1) {
                    recebeDadosDoFilme(sc);
                } else {
                    alugaFilme(sc);
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número!");
            }

        }

    }

    private static void alugaFilme(Scanner scanner) {
        Repository repository = new Repository();

        System.out.println("Digite seu cpf: ");
        Long cpf = Utilidades.validaCpf(scanner);

        Cliente cliente = null;
        if (repository.verificaCliente(cpf) == null) {
            cliente = recebeNovoCliente(cpf);
            System.out.println("Bem-vindo " + cliente.getNome());
        } else {
            cliente = repository.verificaCliente(cpf);
            System.out.println("Bem-vindo de volta " + cliente.getNome());
        }

        System.out.println("Digite o número da fita que deseja alugar: ");
        Filme filme = Utilidades.validaLocacao(scanner);

        System.out.println("Você alugou o filme " + filme.getNome() + ". Bom divertimento!");

        repository.salvaLocacao(cliente, filme);

    }

    static Filme recebeDadosDoFilme(Scanner sc) {
        Repository repository = new Repository();

        System.out.println("Qual � o nome do filme: ");
        String nome = sc.nextLine();
        System.out.println("Qual e o genero? \nOpcoes: AVENTURA, ACAO, COMEDIA, ROMANCE, DRAMA, FICCAO_CIENTIFICA, FANTASIA"
                + "\nDigite:");
        String genero = Utilidades.validaGenero(sc);
        System.out.println("Qual e a faixa etaria? \nOpcoes: G, PG_13, PG_17, R, X\nDigite:");
        String faixaEtaria = Utilidades.validaFaixaEtaria(sc);

        Filme filme = new Filme(nome, GeneroEnum.valueOf(genero), FaixaEtariaEnum.valueOf(faixaEtaria));

        System.out.println(repository.adicionaFilme(filme));

        System.out.println("Obrigado pela preferência!");
        sc.close();
        return filme;
    }

    static Cliente recebeNovoCliente(Long cpf) {
        Repository repository = new Repository();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        repository.cadastraCliente(cliente);

        System.out.println("Cliente cadastrado!");
        return cliente;
    }



}