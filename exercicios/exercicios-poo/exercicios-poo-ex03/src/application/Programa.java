package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String name = sc.nextLine();

        System.out.println("Digite o salario bruto: ");
        double grossSalary = sc.nextDouble();

        System.out.println("Entre com a taxa: ");
        double tax = sc.nextDouble();

        // Criar objeto Employee com os dados inseridos
        Employee employee = new Employee(name, grossSalary, tax);

        // Exibir dados do funcionário antes do aumento de salário
        System.out.println("\nDados do Funcionário antes do aumento:");
        employee.displayInfo();

        // Solicitar a porcentagem de aumento de salário
        System.out.print("\nDigite a porcentagem de aumento de salário: ");
        double percentage = sc.nextDouble();

        // Aumentar o salário do funcionário
        employee.increaseSalary(percentage);

        // Exibir dados do funcionário após o aumento de salário
        System.out.println("\nDados do Funcionário após o aumento:");
        employee.displayInfo();

        // Fechar o scanner
        sc.close();
    }
}
