package funcional_iterface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    /**
     * Representa uma operação que não aceita nenhuma argumento e retorna um
     * resultado do tipo T.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá , seja bem-vindo";

        // Usar o Supplier para obter uma lsita com saudações
        List<String> listaSaudacoes = Stream.generate(
                () -> "Olá , seja bem-vindo").limit(5).toList();

        /// Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);

    }
}
