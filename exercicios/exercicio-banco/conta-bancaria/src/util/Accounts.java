package util;

public class Accounts {

    // Declaração de variáveis de instância
    private int number;
    private String holder;
    private Double balance;

    // Construtor para criar uma conta sem depósito inicial
    public Accounts(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;  // Inicializa o saldo com zero
    }

    // Construtor para criar uma conta com depósito inicial
    public Accounts(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = Math.max(0.0, initialDeposit);  // Inicializa o saldo com zero ou o depósito inicial, garantindo que seja pelo menos zero
    }

    // Métodos de acesso (getters e setters)
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // Método para realizar um depósito
    public void deposit(double amount) {
        balance += amount;
    }

    // Método para realizar uma retirada
    public void withdraw(double amount) {
        // A retirada inclui uma taxa fixa de 5.0
        balance -= amount + 5.0;
    }

    // Método toString para formatar os dados da conta em uma string
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}