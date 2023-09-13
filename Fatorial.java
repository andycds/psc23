import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i; // mesmo que resultado = resultado * i;
        }
        System.out.println(resultado);
        sc.close();
    }
}
