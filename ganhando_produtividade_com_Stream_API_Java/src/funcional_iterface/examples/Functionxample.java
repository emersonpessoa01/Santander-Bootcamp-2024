package funcional_iterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functionxample {
    /**
     * Representa uma função que aceita umargumento do tipo T e retorna um resultado
     * do tipo R.
     * É utilizado para transformar ou mapear os elementos di Stream em outros
     * valores ou tipos.
     */
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usr a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra
        // lista
        List<Integer> numerosDobrados = numeros.stream().map(numero -> numero * 2).toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);

    }
}
