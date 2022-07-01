package Lista_04;


import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] vetor = new int[5];
        for (int x = 0; x < vetor.length; x++) {
            System.out.println("Digite numeros: ");
            vetor[x] = sc.nextInt();
            soma += vetor[x];
        }
        for(int x = 0; x < vetor.length; x++) {
            System.out.println(vetor[x]);
        }
        System.out.println("A soma dos números foram: " + soma);

    }
}
