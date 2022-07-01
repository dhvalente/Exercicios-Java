package Lista_02;

import java.util.Scanner;

public class Ex_10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {

            System.out.println("Informe a medida do lado ");
            double medida = sc.nextDouble();

            if(medida == medida) {
                System.out.println("Equilatero");
            } else if(medida == medida && medida != medida) {
                System.out.println("Isoscele");
            } else if(medida != medida) {
                System.out.println("Escaleno");
            }
        }

    }
}
