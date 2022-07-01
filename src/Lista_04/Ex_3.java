package Lista_04;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];
        for (int x = 0; x < vetor.length; x++) {
            System.out.println("Digite numeros: ");
            vetor[x] = sc.nextInt();
            vetor2[x] = vetor[x];
        }

        for (int x = 0; x < vetor.length; x++) {
            System.out.print(" \n " + vetor[x] + " \n");
        }

        for (int x = 0; x < vetor2.length; x++) {
            System.out.print(" \n " + vetor2[x] * 5 + " \n ");

        }

    }
}
