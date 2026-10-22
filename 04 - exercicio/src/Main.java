import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero:");
        int numeroTrabalhador = sc.nextInt();

        System.out.println("Digite as horas trabalhadas:");
        int x = sc.nextInt();

        System.out.println("Digite valor por hora:");
        double y = sc.nextDouble();

        double resultado = x * y;

        System.out.println("NUMBER: " + numeroTrabalhador + "\nHoras: " + x);
        System.out.printf("SALARY: R$ %.2f%n", resultado);
    }
}
