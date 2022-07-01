package Lista_03;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite numeros");
            numeros = sc.nextInt();
            if (numeros % 2 == 0) {
                System.out.print("Numeros pares digitados: " + numeros);

            } else if (numeros % 2 == 1) {
                System.out.print("Numeros impares digitados: " + numeros);
            }
        }
    }
}
