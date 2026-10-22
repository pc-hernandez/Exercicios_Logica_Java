import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int x = sc.nextInt();

        System.out.println("Digite o valor:");
        int y = sc.nextInt();

        System.out.println("Digite o valor:");
        int z = sc.nextInt();

        System.out.println("Digite o valor:");
        int w = sc.nextInt();

        int resultado = x*y - z*w;
        System.out.println(resultado);
    }
}
