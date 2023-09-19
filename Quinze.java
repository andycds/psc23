import java.util.Scanner;

public class Quinze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Item: " + i + ", preço unitário:");
            double preco = sc.nextDouble();
            System.out.println("Item: " + i + " refrigeração:");
            String refrigeracao = sc.next();
            System.out.println("Item: " + i + ", categoria:");
            String categoria = sc.next();
            // custo estocagem
            double estocagem = 0;
            System.out.println("->" + categoria + "<-");
            if (preco <= 20) {
                switch (categoria) {
                    case "A" -> estocagem = 2;
                    case "L" -> estocagem = 3;
                    case "V" -> estocagem = 4;
                }
            } else if (preco <= 50 && refrigeracao.equals("S")) {
                estocagem = 6;

            } else {
                if (refrigeracao.equals("S")) {
                    switch (categoria) {
                        case "A" -> estocagem = 5;
                        case "L" -> estocagem = 2;
                        case "V" -> estocagem = 4;
                    }
                } else {
                    if (categoria.equals("L")) {
                        estocagem = 1;
                    }
                }
            }
            double imposto = 0.02;
            if (categoria.equals("A") && refrigeracao.equals("S")) {
                imposto = 0.04;
            }
            double precoFinal = preco + estocagem + (preco * imposto);
            String classificacao = "";
            if (precoFinal <= 20) {
                classificacao = "Barato";
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
            } else {
                classificacao = "Caro";
            }
            System.out.println("O custo da estocagem é: " + estocagem);
        }
        sc.close();
    }
}
