package Lista_02;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        Integer primeiro= sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        Integer segundo= sc.nextInt();
        if(primeiro > segundo) {
            System.out.println("O maior valor é: " + primeiro);
        }else {
            System.out.println("O maior valor é: " + segundo);
        }
        sc.close();
    }
}
