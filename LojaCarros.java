import java.util.Scanner;

public class LojaCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos pelo vendedor:");
        int carrosVendidos = sc.nextInt();
        System.out.println("Digite o valor total de suas vendas:");
        double vendas = sc.nextDouble();
        System.out.println("Digite seu salário fixo:");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor recebido por carro vendido:");
        double valorRecebido = sc.nextDouble();

        double pagamento = salarioFixo + (carrosVendidos * valorRecebido) + (vendas * 5 / 100);

        System.out.println("O valor total de pagamento é: " + pagamento);

        sc.close();
    }
}
/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um
 * salário
 * fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
 * do valor
 * das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o
 * valor total de
 * suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
 * Calcular e exibir o
 * salário final do vendedor.
 */