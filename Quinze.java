import java.util.Scanner;

public class Quinze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaValoresAdicionais = 0;
        double maiorPrecoFinal = 0;
        double menorPrecoFinal = Double.MAX_VALUE;
        double totalImpostos = 0;
        int quantBaratos = 0;
        int quantCaros = 0;
        int quantNormal = 0;
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
            System.out.println("O custo da estocagem é: " + estocagem);
            // imposto
            double imposto = 0.02;
            if (categoria.equals("A") && refrigeracao.equals("S")) {
                imposto = 0.04;
            }
            totalImpostos += preco * imposto;
            System.out.println("Alíquota de imposto: " + imposto);
            // preço final
            double precoFinal = preco + estocagem + (preco * imposto);
            somaValoresAdicionais += estocagem + (preco * imposto);
            if (precoFinal > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal;
            }
            if (precoFinal < menorPrecoFinal) {
                menorPrecoFinal = precoFinal;
            }
            System.out.println("Preço final: " + precoFinal);
            // classificação
            String classificacao = "";
            if (precoFinal <= 20) {
                classificacao = "Barato";
                quantBaratos++;
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
                quantNormal++;
            } else {
                classificacao = "Caro";
                quantCaros++;
            }
            System.out.println("Classificação: " + classificacao);
        }
        System.out.println("\nMédia dos valores adicionais: " + (somaValoresAdicionais / 12));
        System.out.println("Maior preço final:" + maiorPrecoFinal);
        System.out.println("Menor preço final:" + menorPrecoFinal);
        System.out.println("Total de impostos: " + totalImpostos);
        System.out.println("Baratos: " + quantBaratos);
        System.out.println("Normal: " + quantNormal);
        System.out.println("Caros: " + quantCaros);
        sc.close();
    }
}
