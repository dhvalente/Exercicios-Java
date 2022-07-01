package Lista_02;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de lados: ");
        int lados = sc.nextInt();
        System.out.println("Informe a medida do lado em cm: ");
        double medida = sc.nextDouble();

        if(lados < 3) {
            System.out.println("Não é um poligono");
        } else if(lados > 5) {
            System.out.println("Poligono não identificado");
        }
        else if(lados == 3) {
            System.out.println("Triangulo");
        } else if(lados == 4) {
            System.out.println("Quadrado");
        } else if(lados == 5) {
            System.out.println("Pentagono");
        }
    }
}
