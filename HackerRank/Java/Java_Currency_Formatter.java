import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        NumberFormat objin = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String in = objin.format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);

        System.out.println("India: " + in);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}