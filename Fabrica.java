import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalSalarios = 0;
        int totalPecas = 0;
        int totalH = 0;
        int totalM = 0;
        int pecasH = 0;
        int pecasM = 0;
        double maiorSalario = 0;
        int numeroMaior = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("numero do funcionario");
            int numero = sc.nextInt();
            System.out.println("sexo do funcionario");
            String sexo = sc.next();
            System.out.println("quantidade de peças");
            int pecas = sc.nextInt();
            double salario = 1320;
            double salarioporcen = salario;
            if (pecas > 20) {
                salarioporcen += salario * 0.03 * (pecas - 20);
            }
            if (pecas > 30) {
                salarioporcen += salario * 0.02 * (pecas - 30);
            }
            System.out.println(numero + "seu salario é:" + salarioporcen);
            if (salarioporcen > maiorSalario) {
                maiorSalario = salarioporcen;
                numeroMaior = numero;
            }
            totalSalarios += salarioporcen;
            totalPecas += pecas;
            if (sexo.equals("H")) {
                totalH++;
                pecasH += pecas;
            } else {
                totalM++;
                pecasM += pecas;
            }

        }

        System.out.println("O total salarios é:" + totalSalarios);
        System.out.println("o total de peças:" + totalPecas);
        System.out.println("media homem" + (pecasH / totalH));
        System.out.println("media mulheres" + (pecasM / totalM));

        sc.close();

    }

}
