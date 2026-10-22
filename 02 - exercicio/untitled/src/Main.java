import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite o valor para x: ");
        double x = sc.nextDouble();

        pi *= x*x;

        System.out.println(pi);
    }
}
