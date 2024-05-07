import java.util.Scanner;

public class VerificadorNumeroConta {

    /**
     * <p>
     * Descrição
     * Você está desenvolvendo um programa simples em Java para verificar se um
     * número de conta bancária é válido. O número da conta deve ter exatamente 8
     * dígitos.
     * 
     * Entrada
     * O programa solicitará ao usuário que digite o número da conta bancária.
     * Saída
     * O programa utilizará um bloco try-catch para verificar se o número da conta
     * possui exatamente 8 dígitos.
     * Se o número da conta tiver 8 dígitos, o programa informará que é um número
     * válido.
     * Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por
     * exemplo, IllegalArgumentException) e informará que o número da conta é
     * inválido.
     * </p>
     * 
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}