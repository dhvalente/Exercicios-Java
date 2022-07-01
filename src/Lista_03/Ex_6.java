package Lista_03;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite números");
            num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                System.out.println("Esse numero esta no intervalo de 10 a 20 ");
            } else if (num < 10 || num > 20) {
                System.out.println("Esse numero não esta no intervalo de 10 a 20 ");
            }
        }


    }
}
