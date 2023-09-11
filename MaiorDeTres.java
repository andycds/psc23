import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número A");
        double a = sc.nextDouble();
        System.out.println("Digite o número B");
        double b = sc.nextDouble();
        System.out.println("Digite o número C");
        double c = sc.nextDouble();
        System.out.println("O maior é o: ");
        // if ((a > b) && (a > c)) {
        // System.out.print(a);
        // } else if ((b > a) && (b > c)) {
        // System.out.print(b);
        // } else {
        // System.out.print(c);
        // }

        // double maiorIntermediario = a > b ? a : b;
        // double maior = maiorIntermediario > c ? maiorIntermediario : c;
        // System.out.print(maior);
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        sc.close();
    }
}
