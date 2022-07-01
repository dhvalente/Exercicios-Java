package Lista_01;

import java.util.Scanner;

public class Ex_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a massa: ");
        Double m = sc.nextDouble();
        System.out.println("Digite a altura: ");
        Double h = sc.nextDouble();
        System.out.println("Digite o tempo: ");
        Double t = sc.nextDouble();

        Double cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é " + cavalos);
        sc.close();
    }
}
