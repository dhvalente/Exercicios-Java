package Lista_04;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];
        int num;
        for (int x = 0; x < 10; x++) {
            System.out.println("Digite numeros: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                vetor[x] = num;

            } else if (num % 2 == 1) {
                vetor2[x] = num;
            }
        }
        for (int x = 0; x < vetor.length; x++) {
            System.out.println(vetor[x]);
        }
        for (int x = 0; x < vetor.length; x++) {
            System.out.println(vetor2[x]);
        }

    }
}
