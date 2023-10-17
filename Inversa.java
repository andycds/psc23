/* Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
 */

import java.util.Scanner;

public class Inversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números da sequência: ");
        int n = sc.nextInt();
        int sequencia[] = new int[n];

        for (int i = 0; i < sequencia.length; i++) {
            System.out.println("Digite o número: ");
            sequencia[i] = sc.nextInt();
        }
        for (int i = sequencia.length - 1; i >= 0; i--) {
            System.out.print(sequencia[i] + ", ");
        }

        sc.close();
    }
}
