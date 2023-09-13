/* Escreva um programa que verifica se um número natural digitado pelo usuário é primo. */

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        long n = sc.nextLong();
        if (n <= 3) {
            System.out.println("É primo");
        } else {
            // e agora?
            boolean ehPrimo = true;
            // fazer as divisões
            for (long div = 2; div < (n - 1); div++) {
                if (n % div == 0) {
                    System.out.println("consegui dividir por: " + div);
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }
        sc.close();
    }
}
