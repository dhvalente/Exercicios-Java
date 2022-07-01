package Lista_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<Integer>();
        for (int x = 0; x < 3; x++) {
            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();
            valores.add(valor);
        }
        valores.sort(Comparator.naturalOrder());

        System.out.println(valores);


    }

}
