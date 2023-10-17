/*Numa sala de pós graduação, há 10 alunos. Utilize um array para guardar a nota (um inteiro de 0 a 10) de cada um deles e imprima a média da turma */

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos alunos?");
        int alunos = sc.nextInt();
        int notas[] = new int[alunos];
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota (" + i + "): ");
            notas[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < alunos; i++) {
            soma += notas[i];
        }
        // double alunosd = alunos;
        double media = soma / Double.valueOf(alunos);
        System.out.println("Média: " + media);
        sc.close();
    }
}
