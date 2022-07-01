package Lista_01;

import java.util.Scanner;

public class Ex_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        Double R = sc.nextDouble();
        System.out.println("Digite a altura: ");
        Double A = sc.nextDouble();

        Double V = 3.14159 * R * R * A;
        System.out.println("O volume da lata de óleo é de " + V + " m³");
        sc.close();
    }
}
