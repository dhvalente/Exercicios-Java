package Lista_03;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double media = 0.0;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3) /3;

        if(media < 6) {
            System.out.println("Sua média foi: " + media + ", Portanto você está reprovado");
        } else {
            System.out.println("Sua média foi: " + media + ", Portanto você está aprovado");
        }



    }
}
