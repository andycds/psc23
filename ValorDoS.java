import java.util.Scanner;

public class ValorDoS {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos termos?");
        int quantidade = leitor.nextInt();
        System.out.println("x?");
        double x = leitor.nextDouble();
        double s = 0;
        for (int expoente = 2; expoente < quantidade + 2; expoente++) {
            double dividendo = Math.pow(x, expoente);
            double divisor = 1;
            switch ((expoente - 1) % 6) {
                case 1 -> divisor = 1;
                case 2 -> divisor = 2;
                case 3 -> divisor = 6;
                case 4 -> divisor = 24;
                case 5 -> divisor = 6;
                case 0 -> divisor = 2;
            }
            double termo = (dividendo / divisor);
            System.out.println("termo:" + termo);
            // if (expoente % 2 == 0) {
            // s = s - termo;
            // } else {
            // s = s + termo;
            // }
            if (expoente % 2 == 0) {
                termo *= -1;
            }
            s += termo;
        }
        System.out.println(s);
        leitor.close();
    }
}
