import java.util.Scanner;

public class Comprimento {
    public static void main(String[] args) {
        System.out.println("Digite duas palavras");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] palavras = texto.split(" ");
        System.out.println("comprimento primeira palavra: " + palavras[0].length());
        System.out.println("comprimento segunda palavra: " + palavras[1].length());
        sc.close();
    }
}
