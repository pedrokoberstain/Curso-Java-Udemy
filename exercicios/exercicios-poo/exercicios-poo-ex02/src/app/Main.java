package app;

import entities.Conv;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static double dollarPrice;
    public static double dollars;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dollars =sc.nextDouble();

        double amountInReais = Conv.convert(dollarPrice, dollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", amountInReais);

        sc.close();



    }
}
