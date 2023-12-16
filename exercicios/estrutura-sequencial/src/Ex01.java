package src;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Cria um objeto Scanner chamado "sc" para receber entrada do teclado.
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis inteiras "a", "b" e "soma".
        int a, b, soma;

        // Solicita e armazena a entrada do usuário para a variável "a".
        a = sc.nextInt();

        // Solicita e armazena a entrada do usuário para a variável "b".
        b = sc.nextInt();

        // Calcula a soma das variáveis "a" e "b" e armazena o resultado em "soma".
        soma = a + b;

        // Exibe o resultado da soma na tela.
        System.out.println("Soma = " + soma);

        // Fecha o objeto Scanner para evitar vazamentos de recursos.
        sc.close();
    }
}
