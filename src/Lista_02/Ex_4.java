package Lista_02;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de maças que deseja comprar: ");
        int qtdMaca = sc.nextInt();
        double precoMaca;
        if (qtdMaca < 12) {
            precoMaca = 0.30;
        } else {
            precoMaca = 0.25;
        }

        System.out.println("O valor total da compra é: R$ " + qtdMaca * precoMaca);
    }
}
