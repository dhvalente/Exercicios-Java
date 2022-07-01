package Lista_02;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer anoAtual = LocalDate.now().getYear();
        System.out.println("Qual ano você nasceu?");
        Integer anoNascimento = sc.nextInt();
        Integer v = anoAtual - anoNascimento;
        if (v >= 16) {
            System.out.println("Voce poderá votar esse ano!");
        } else {
            System.out.println("Voce não poderá votar esse ano!");
        }
        sc.close();
    }
}
