import java.util.Scanner;

public class StringParcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string");
        String s = sc.nextLine();
        System.out.println("Digite 2 posições");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(s.substring(a, b + 1));
    }
}
