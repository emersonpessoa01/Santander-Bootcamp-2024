// import java.util.Scanner;

// public class SimulacaoBancaria {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int opcao;
//         double saldo = 0;

//         while (true) {
//             System.out.println("\nMenu:");
//             System.out.println("1. Depositar");
//             System.out.println("2. Sacar");
//             System.out.println("3. Consultar Saldo");
//             System.out.println("4. Encerrar");
//             System.out.print("Digite sua opção: ");

//             opcao = scanner.nextInt();

//             switch (opcao) {
//                 case 1:
//                     System.out.print("Valor a depositar: ");
//                     double valorDeposito = scanner.nextDouble();
//                     saldo += valorDeposito;
//                     System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
//                     break;
//                 case 2:
//                     System.out.print("Valor a sacar: ");
//                     double valorSaque = scanner.nextDouble();
//                     if (valorSaque <= saldo) {
//                         saldo -= valorSaque;
//                         System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
//                     } else {
//                         System.out.println("Saldo insuficiente para saque!");
//                     }
//                     break;
//                 case 3:
//                     System.out.println("Seu saldo atual é: " + saldo);
//                     break;
//                 case 4:
//                     System.out.println("Obrigado por usar nossos serviços!");
//                     scanner.close();
//                     System.exit(0);
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         }
//     }
// }

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}