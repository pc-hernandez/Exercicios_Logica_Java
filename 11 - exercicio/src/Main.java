import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        if (a < 0){
            System.out.println("FORA DO INTERVALO");
        }
        else if (a <= 25.00) {
            System.out.println("INTERVALO [0, 25]");
        }
        else if (a <= 50.00) {
            System.out.println("INTERVALO [25, 50]");
        }
        else if (a <= 75.00) {
            System.out.println("INTERVALO [50, 75]");
        }
        else {
            System.out.println("INTERVALO [75, 100]");
        }
    }
}