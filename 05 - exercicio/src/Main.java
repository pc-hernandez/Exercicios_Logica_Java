import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int y = sc.nextInt();
        double z = sc.nextDouble();

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        double resultado = y * z + b * c;

        System.out.print(resultado);

    }
}