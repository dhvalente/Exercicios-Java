package Lista_02;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pesoM = 0.0;
        double pesoH = 0.0;

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe o seu sexo: 1 - Feminino  2 - Masculino");
        int sexo = sc.nextInt();

        if(sexo == 1) {
            pesoM = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " +pesoM);
        } else if (sexo == 2) {
            pesoH = (72.7 * altura) - 58;

            System.out.println("Seu peso ideal é: " +pesoH);
        }

    }

}
