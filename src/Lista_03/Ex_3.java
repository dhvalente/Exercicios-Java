package Lista_03;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da tabuada: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }

}
