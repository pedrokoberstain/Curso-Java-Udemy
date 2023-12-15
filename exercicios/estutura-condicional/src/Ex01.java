import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        number = sc.nextInt();

        if ( number > 0){
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
