import java.util.Scanner;

public class EFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        // E = 1 + 1/1! + 1⁄2! + 1/3! + ... + 1/N!
        double e = 1;
        for (int i = 1; i <= n; i++) {
            double fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }
            e = e + (1 / fatorial);
        }
        System.out.println(e);
        sc.close();
    }
}
