package Lista_05;

import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTotal = 0;

        System.out.print("Quantos votos recebeu o candidato A:?");
        int a = sc.nextInt();
        System.out.print("Quantos votos recebeu o candidato B:?");
        int b = sc.nextInt();
        System.out.print("Quantos votos recebeu o candidato C:?");
        int c = sc.nextInt();
        System.out.print("Quantos foram os votos brancos? ");
        int vBranco = sc.nextInt();
        System.out.print("Quantos foram os votos nulos? ");
        int nulos = sc.nextInt();

        nTotal = a + b + c + vBranco + nulos;

        System.out.println("O número total de eleitores foram: " +nTotal);

        int percentualA = (a*100)/nTotal;
        int percentualB = (b*100)/nTotal;
        int percentualC = (c*100)/nTotal;
        int percentualBranco = (vBranco*100)/nTotal;
        int percentualNulo = (nulos*100)/nTotal;

        System.out.println("O percentual de votos do candidato A foi: " +percentualA);
        System.out.println("O percentual de votos do candidato B foi: " +percentualB);
        System.out.println("O percentual de votos do candidato C foi: " +percentualC);
        System.out.println("O percentual de votos brancos foi: " +percentualBranco);
        System.out.println("O percentual de votos nulos foi: " +percentualNulo);

    }
}
