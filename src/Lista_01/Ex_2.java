package Lista_01;
import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAltura = 0.0;
        double numM = 0.0;
        double numH = 0.0;
        double maiorAltura = 0.0;
        double menorAltura = 0.0;
        for (int x = 0; x <= 3; x++) {
            System.out.println("Informe a sua altura: ");
            double altura = sc.nextDouble();
            System.out.println("Informe seu sexo F ou M: ");
            char sexo = sc.next().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;

            }
            if (altura < menorAltura) {
                menorAltura = altura;

            }

            if (sexo == 'M') {
                numH++;
                mediaAltura = altura / numH;

            }
            if (sexo == 'F') {
                numM++;

            }
        }
        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A média de altura dos homens é: " + mediaAltura);
        System.out.println("O número de mulheres são: " + numM);
    }

}