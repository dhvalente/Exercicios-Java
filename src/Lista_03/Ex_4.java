package Lista_03;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        double media = 0.0;
        int somaIdade = 0;
        for(int i = 0; i <= 5; i++) {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            somaIdade += idade;
            media = somaIdade / 5;
        }
        if(media > 18) {
            System.out.println("Aqui tem maiores");
        } else {
            System.out.println("Menores");
        }

    }

}
