/*12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3. */

import java.util.Scanner;

public class SenhaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma senha de 4 dígitos: ");
        int senha = sc.nextInt();
        sc.close();
        if (senha >= 1000 && senha <= 9999) {
            int digitoMilhar = senha / 1000;
            int digitoCentena = (senha % 1000) / 100;
            int digitoDezena = (senha % 100) / 10;
            int digitoUnidade = senha % 10;
            if (digitoMilhar == 8 || digitoMilhar == 5) {
                if (digitoUnidade == 5 || digitoUnidade == 1) {
                    int somaCentenaDezena = digitoCentena + digitoDezena;
                    if (digitoUnidade == 5) {
                        if (somaCentenaDezena != 3) {
                            System.out.println("Como a unidade é 5, a dezena + centena tem que ser 3");
                            return;
                        }
                    } else {
                        System.out.println("Senha válida");
                        return;
                    }
                    if (digitoUnidade == 1) {
                        if (somaCentenaDezena != 0) {
                            System.out.println("Como a unidade é 1, a dezena + centena tem que ser 0");
                            return;
                        } else {
                            System.out.println("Senha válida");
                            return;
                        }
                    }
                    System.out.println("Senha válida");
                } else {
                    System.out.println("Unidade não é 5 nem 1.");
                }
            } else {
                System.out.println("Milhar não é 8 nem 5.");
            }
        } else {
            System.out.println("Senha tem que ter 4 dígitos.");
        }
    }
}
