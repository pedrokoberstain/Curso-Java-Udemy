package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lista para armazenar produtos de diferentes tipos
        List<Product> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        // Loop para coletar dados do usuário e criar objetos
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextDouble();

            // Criação de objetos com base no tipo de produto escolhido
            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        // Exibição das etiquetas de preço
        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
