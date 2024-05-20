package testes;

import java.util.Scanner;

public class CalculoSalarioLiquido {

    /**
     * <p>Faça um programa que calcule e imprima o salário a ser transferido para um
     * funcionário.</p>
     * 
     * <p>Para realizar o cálculo receba o valor bruto do salário e o adicional dos
     * benefícios.
     * Gere um algoritmo em java com o seguinte desafio:
     * O salário a ser transferido é calculado da seguinte maneira:</p>
     * 
     * <p>(valor bruto do salário - percentagem de imporsto mediante ao salário) +
     * adicional dos benefícios</p>
     * 
     * <p>Para calcular o percentual de imposto segue as alíquotas:</p>
     * <p>De R$ 0.00 a R$ 1100.00 = 5.00%</p>
     * <p>De R$ 1100.01 a R$ 2500.00 = 10.00%</p>
     * <p>Maior que R$ 2500.00 = 15.00%</p>
     * 
     * @param args
     */

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // Declaração de variáveis
        double salarioBruto, adicionalBeneficios, salarioLiquido, valorImposto;
        int porcentagemImposto;

        // Entrada de dados
        System.out.print("Informe o valor do salário bruto: ");
        salarioBruto = scanner.nextDouble();

        System.out.print("Informe o valor do adicional de benefícios: ");
        adicionalBeneficios = scanner.nextDouble();

        // Cálculo do percentual de imposto
        if (salarioBruto <= 1100.00) {
            porcentagemImposto = 5;
        } else if (salarioBruto <= 2500.00) {
            porcentagemImposto = 10;
        } else {
            porcentagemImposto = 15;
        }

        // Cálculo do valor do imposto
        valorImposto = (salarioBruto * porcentagemImposto) / 100;

        // Cálculo do salário líquido
        salarioLiquido = salarioBruto - valorImposto + adicionalBeneficios;

        // Impressão do resultado
        System.out.printf("O salário líquido a ser transferido é: R$ %.2f\n", salarioLiquido);
    }
}
