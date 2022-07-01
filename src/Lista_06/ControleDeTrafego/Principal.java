package Lista_06.ControleDeTrafego;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        AeronaveRepository.populatAeronaveList();

        Comunicacao.menuInicial(scanner);
    }

}