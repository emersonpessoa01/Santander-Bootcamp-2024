import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    /**
     * <h3>Configuração de argumentos</h3>
     * 
     * @param args
     */
    /**
     * public static void main(String[] args) {
     * // os argumentos começam com indice 0
     * String nome = args[0];
     * String sobrenome = args[1];
     * int idade = Integer.valueOf(args[2]); // vamos falar sobre Wrappers
     * double altura = Double.valueOf(args[3]);
     * 
     * System.out.println("Ola, me chamo " + nome + " " + sobrenome);
     * System.out.println("Tenho " + idade + " anos ");
     * System.out.println("Minha altura eh " + altura + "cm");
     * }
     */
    public static void main(String[] args) {
        try {
            try (// criando o objeto scanner
                    Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite seu nome");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome");
                String sobrenome = scanner.next();

                System.out.println("Digite sua idade");
                int idade = scanner.nextInt();

                System.out.println("Digite sua altura");
                double altura = scanner.nextDouble();

                // imprimindo os dados obtidos pelo usuario
                System.out.println("Ola, me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + "cm ");
            }

        } catch (Exception e) {
            System.out.println("O campos idade e altura precisam ser numéricos");

        }

    }
}
