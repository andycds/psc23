import java.util.Scanner;

public class PodeDirigir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println(idade >= 18 ? "Pode dirigir" : "Não pode");
        sc.close();
    }
}
