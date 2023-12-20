package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> list = new ArrayList<>();

        System.out.println("Informe o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n;i++) {
            System.out.print("Dados do contribuinte # " + i + ":");
            System.out.println("Pessoa física ou jurídica (f/j)?");
            char type = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Renda anual: ");
            double income = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Despesas com saúde: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpenditures));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, income, numberOfEmployees));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        for (Contribuintes tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": R$ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("IMPOSTOS TOTAIS: R$ " + String.format("%.2f", sum));

        sc.close();
    }
}