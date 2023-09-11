import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cotação do Dólar: ");
        double cotacao = scanner.nextDouble();
        System.out.println("Digite a quantidade de Dólares: ");
        double quantidade = scanner.nextDouble();
        double real = cotacao * quantidade;
        System.out.println("Quantidade em Dólar: " + quantidade + "; em Real: " + real);
        scanner.close();
    }
}