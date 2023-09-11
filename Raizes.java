import java.util.Scanner;

public class Raizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os 3 coeficientes");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - Math.sqrt(4 * a * c);
        if (delta < 0) {
            System.out.println("Não tem raízes");
        } else if (delta == 0) {
            System.out.println("A raiz é");
            double raiz = -b / (2 * a);
            System.out.println(raiz);
        } else {
            System.out.println("Temos duas raízes:");
            double raizMais = (-b + delta) / (2 * a);
            System.out.println("primeira: " + raizMais);
            double raizMenos = (-b - delta) / (2 * a);
            System.out.println("segunda: " + raizMenos);

        }
    }
}
