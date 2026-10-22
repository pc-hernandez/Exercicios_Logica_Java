import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triRetangulo = (a * c)/2;

        double pi = 3.14159;
        pi *= c*c;

        double trapezio = ((a+b) * c)/2;

        double quadrado = b*b;

        double retangulo = a * b;

        System.out.println("TRIANGULO: " + triRetangulo);
        System.out.println("CIRCULO: " + pi);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);
    }
}