package application;

import util.Accounts;

import java.util.Locale;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Declaração da variável para armazenar a conta bancária
        Accounts account;

        // Solicita e lê o número da conta
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        // Limpa o buffer do scanner antes de ler a string
        sc.nextLine();

        // Solicita e lê o titular da conta
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        // Solicita e lê se há um depósito inicial
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        // Verifica se há um depósito inicial
        if (response == 'y') {
            // Solicita e lê o valor do depósito inicial
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            // Cria uma conta com depósito inicial
            account = new Accounts(number, holder, initialDeposit);
        } else {
            // Cria uma conta sem depósito inicial
            account = new Accounts(number, holder);
        }

        // Imprime uma linha em branco
        System.out.println();

        // Exibe os dados da conta
        System.out.println("Account data:");
        System.out.println(account);

        // Solicita e lê o valor de depósito
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();

        // Realiza um depósito na conta
        account.deposit(depositValue);

        // Exibe os dados atualizados da conta após o depósito
        System.out.println("Updated account data:");
        System.out.println(account);

        // Solicita e lê o valor de retirada
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();

        // Realiza uma retirada na conta
        account.withdraw(withdrawValue);

        // Exibe os dados atualizados da conta após a retirada
        System.out.println("Updated account data:");
        System.out.println(account);

        // Fecha o Scanner para liberar os recursos
        sc.close();
    }
}
