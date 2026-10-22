import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
            else if (x > 0 && y > 0) {
                System.out.println("Q1");
            }
            else {
                System.out.println("Q2");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        System.out.println("ACABOU");
    }
}