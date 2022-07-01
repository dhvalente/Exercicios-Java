package Lista_03;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        boolean isValid = false;
        while(!isValid){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero");
            Integer number = scanner.nextInt();
            if (number >= 12 && number <= 20){
                System.out.println("Entrada permitida");
                isValid = true;
            }else {
                System.out.println("Entrada inválida");
            }
        }
    }

}
