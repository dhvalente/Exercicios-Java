package Lista_01;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mediaSalario = 0.0;

        System.out.println("Informe a grade de funcionários: ");

        Integer grade = sc.nextInt();

        for(int i = 1; i <= grade; i++) {
            System.out.println("Digite o salário do funcionario: " +i);

            double salario = sc.nextDouble();

            mediaSalario += salario / grade;

        }

        System.out.println("A média salárial dos funcionários é: " +mediaSalario);
    }
}
