/* Crie um vetor com 10 números aleatórios inteiros de 0 a 99 e imprima-os.
 * Ordene seu vetor do menor para o maior e imprima-o novamente. */

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = aleatorio.nextInt(100);
            System.out.print(vetor[i] + ", ");
        }
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10 - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // trocar
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}
