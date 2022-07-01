package Lista_01;

import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura da parede: ");
        Float alturaP = sc.nextFloat();
        System.out.print("Informe a largura da parede: ");
        Float larguraP = sc.nextFloat();
        Float areaParede = alturaP * larguraP;

        System.out.print("Informe a altura do azuleijo: ");
        Float alturaA = sc.nextFloat();
        System.out.print("Informe a largura do azuleijo: ");
        Float larguraA = sc.nextFloat();
        Float areaAzuleijo = alturaA * larguraA;

        Float quantidade = areaParede / areaAzuleijo;
        double total = arredondar(quantidade);
        System.out.println(total);
        sc.close();

    }

    private static double arredondar(double media) {
        return Math.round(media * 100.0) / 100.0;
    }
}
