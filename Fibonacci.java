import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos? ");
        int termos = sc.nextInt();
        System.out.println();
        for (int i = 0; i < termos; i++) {
            System.out.print(a + "-");
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println();
        sc.close();
    }
}
