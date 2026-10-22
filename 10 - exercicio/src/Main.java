import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double resultado;

        if (a == 1){
            resultado = 4.00 * b;
        }
        else if (a == 2){
            resultado = 4.50 * b;
        }
        else if (a == 3){
            resultado = 5.00 * b;
        }
        else if (a == 4){
            resultado = 2.0 * b;
        }
        else {
            resultado = 1.50 * b;
        }

        System.out.printf("Total: R$ %.2f%n", resultado);
    }
}