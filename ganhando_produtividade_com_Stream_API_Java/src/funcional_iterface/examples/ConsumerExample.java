package funcional_iterface.examples;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class ConsumerExample {

    public static <T> void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        );
        // Criar uma lista de números inteiros
        // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // // Método para imprimir os números
        // Consumer<Integer> imprimirNumeroPar = numero -> {
        // if (numero % 2 == 0) {
        // System.out.println(numero);
        // }
        // return;
        // };

        // numeros.stream().forEach(imprimirNumeroPar);

        // Método para imprimir os números
        // numeros.stream().forEach(new Consumer<Integer>() {
        // @Override
        // public void accept(Integer n) {
        // if (n % 2 == 0) {
        // System.out.println(n);
        // }
        // }

        // });

    }

}