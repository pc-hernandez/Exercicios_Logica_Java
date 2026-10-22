import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para a: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor para b: ");
        int y = sc.nextInt();

        System.out.println(x+=y);
    }
}
