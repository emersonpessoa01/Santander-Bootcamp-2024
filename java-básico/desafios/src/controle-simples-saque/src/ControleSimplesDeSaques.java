import java.util.Scanner;

public class ControleSimplesDeSaques {

    /**
     * 
     * <h3>Descrição</h3>
     * Você está desenvolvendo um programa simples em Java para auxiliar um cliente
     * a realizar saques de uma conta bancária. O cliente pode fazer saques até
     * atingir um limite diário predefinido.
     * 
     * <h3>Entrada</h3>
     * O programa solicitará ao usuário que informe o limite diário de saque.
     * Em seguida, o programa solicitará ao usuário que informe o valor do primeiro
     * saque.
     * 
     * <h3>Saída</h3>
     * Utilizando um laço for, o programa iterará sobre os saques.
     * Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
     * Se ultrapassar, o programa informará que o limite foi atingido e encerrará o
     * loop.
     * Se não ultrapassar, o programa informará que o saque foi realizado com
     * sucesso.
     * 
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        // Faço uma conversão explicita para utilizar o valor como contador no laço for
        int counter = (int) limiteDiario;
        // iterando
        for (int i = 0; i < counter; i++) {
            // recebendo o valor do saque
            double saque = scanner.nextDouble();
            // Num laço valido se o valor inserido é zero, caso sim encerramos o laço
            // através do Break
            if (saque <= 0) {
                System.out.println("Transacoes encerradas.");
                break;
                // se o valor inserido do saque for maior que zero e menor que o limiteDiario eu
                // faço o saque e continuo o laço;
            } else if (saque > 0 && saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                // Em outro caso encerramos a aplicação
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();

    }
}