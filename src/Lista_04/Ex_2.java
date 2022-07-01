package Lista_04;

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[5];
        for (int x = 0; x < vetor.length; x++) {
            System.out.println("Digite 5 nomes: ");
            vetor[x] = sc.next();
        }

        for (int x = 0; x < vetor.length; x++) {
            System.out.print(" \n " + vetor[x] + " \n");
        }

        for (int x = vetor.length - 1; x >= 0; x--) {
            System.out.print(" \n " + vetor[x] + " \n ");
        }

    }
}
