import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = Scanner.nextLine();

        System.out.println("O número de sua agência: ");
        String agencia = Scanner.nextLine();

        System.out.println("O digite o número de sua conta corrente: ");
        int conta = Scanner.nextInt();

        System.out.println("Por favor, digite o valor de seu saldo: ");
        double saldo = Scanner.nextDouble();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ",");
        System.out.println("Conta corrente " + conta + " e seu saldo é " + saldo + ",");
        System.out.println("Já está disponível para saque.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");

    }
}
