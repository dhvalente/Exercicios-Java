package Lista_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_1 {
    static boolean isMatcher = false;
    private static String temp;
    //Utilizei regex para aprendizado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "([0-9])+([0-9]?)+.?([0-9])?";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Informe a temperatura desejada para conversão em graus celsius. Ex>>>33.6");
        temp = sc.next();
        Matcher matcher = pattern.matcher(temp);
        isMatcher = matcher.find();
        while (!isMatcher) {
            System.out.println("Por favor digite a temperatura corretamente e caso necessário separe por ponto");
            temp = sc.next();
            Matcher matcher2 = pattern.matcher(temp);
            isMatcher = matcher2.find();
        }
        Double tempDouble = Double.parseDouble(temp);
        Double fahrenheitTemp = (tempDouble * 1.8) + 32;
        Double kelvinTemp = tempDouble + 273.15;
        Double reaumurTemp = tempDouble * 0.8;
        Double rankineTemp = (tempDouble * 1.8) + 32 + 459.67;
        System.out.println(String.format("Temperatura em Fahrenheit: %.2f", fahrenheitTemp));
        System.out.println(String.format("Temperatura em Kelvin: %.2f", kelvinTemp));
        System.out.println(String.format("Temperatura em Réaumur: %.2f", reaumurTemp));
        System.out.println(String.format("Temperatura em Rankine: %.2f", rankineTemp));
        sc.close();
    }
}
