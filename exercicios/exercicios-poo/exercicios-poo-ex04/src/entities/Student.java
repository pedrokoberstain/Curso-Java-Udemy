package entities;

public class Student {

    private String Name;
    private double firstQuarterGrade;
    private double secondQuarterGrade;
    private double thirdQuarterGrade;

    public Student(String name, double firstQuarterGrade, double secondQuarterGrade, double thirdQuarterGrade) {
        Name = name;
        this.firstQuarterGrade = firstQuarterGrade;
        this.secondQuarterGrade = secondQuarterGrade;
        this.thirdQuarterGrade = thirdQuarterGrade;
    }

    public double calculateFinalGrade() {
        return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
    }

    public boolean isPassed() {
        double finalGrade = calculateFinalGrade();
        return finalGrade >= 60.0;
    }

    // Método para calcular os pontos que faltam para a aprovação
    public double missingPoints() {
        double finalGrade = calculateFinalGrade();
        double minimumPassingGrade = 60.0;
        return minimumPassingGrade - finalGrade;
    }

    // Método para exibir o resultado
    public void displayResult() {
        System.out.println("FINAL GRADE = " + String.format("%.2f", calculateFinalGrade()));

        if (isPassed()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", missingPoints()) + " POINTS");
        }
    }
}

