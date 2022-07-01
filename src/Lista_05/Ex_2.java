package Lista_05;

import java.util.Scanner;
public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 85;
        for(int x = 1; x <= 10; x++) {
            System.out.println("Chute numéro: " + x);
            int tentativa = sc.nextInt();
            if(tentativa == 85) {
                System.out.println("ACERTOU! PARABÉNS! VOCÊ PRECISOU DE " + x + " CHANCES");
                break;
            } else if(tentativa < 85) {
                System.out.println("CHUTOU BAIXO");
            } else if(tentativa > 85) {
                System.out.println("CHUTOU ALTO");
            }
        }

    }
}
