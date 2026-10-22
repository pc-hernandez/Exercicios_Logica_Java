import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (x != 4){
            if (x == 1){
                alcool += 1;
            }
            else if (x == 2){
                gasolina += 1;
            }
            else if (x == 3){
                diesel += 1;
            }
            else {
                System.out.printf("VALOR INVALIDO \n");
            }
            x = sc.nextInt();
        }
        System.out.print("ALCOOL: " + alcool + "\n" + "GASOLINA: " + gasolina + "\n" + "DIESEL: " +  diesel);

    }
}