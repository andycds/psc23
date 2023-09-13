import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nDigite um número: ");
            x = sc.nextInt();
            System.out.print(x * x);
        } while (x != 0);
        sc.close();
    }
}
