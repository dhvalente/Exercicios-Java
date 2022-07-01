package Lista_02;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwordManager = 1234;
        System.out.print("Digite sua senha de acesso:");
        int password = sc.nextInt();

        if (password == passwordManager) {
            System.out.println("<<< Entrada permitida >>>");
        } else {
            System.out.println("<<< Entrada proibida >>>");
        }
        sc.close();
    }
}
