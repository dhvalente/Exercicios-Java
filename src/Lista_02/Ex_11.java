package Lista_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro angulo: ");
        double anguloA = sc.nextDouble();
        System.out.println("Informe o valor do primeiro angulo: ");
        double anguloB = sc.nextDouble();
        System.out.println("Informe o valor do primeiro angulo: ");
        double anguloC = sc.nextDouble();

        if (anguloA == 90 && anguloB == 90 && anguloC == 90) {
            System.out.println("Triangulo retangulo");
        } else if (anguloA > 90 && anguloB > 90 && anguloC > 90) {
            System.out.println("Obtusangulo");
        } else if (anguloA < 90 && anguloB < 90 && anguloC < 90) {
            System.out.println("Acutangulo");
        }
    }
}
