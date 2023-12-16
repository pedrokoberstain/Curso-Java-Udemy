package application;

import entities.Student;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do aluno
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter first quarter grade: ");
        double firstQuarterGrade = scanner.nextDouble();

        System.out.print("Enter second quarter grade: ");
        double secondQuarterGrade = scanner.nextDouble();

        System.out.print("Enter third quarter grade: ");
        double thirdQuarterGrade = scanner.nextDouble();

        // Criar objeto Student com os dados inseridos
        Student student = new Student(name, firstQuarterGrade, secondQuarterGrade, thirdQuarterGrade);

        // Exibir resultado
        student.displayResult();

        // Fechar o scanner
        scanner.close();
    }
}
