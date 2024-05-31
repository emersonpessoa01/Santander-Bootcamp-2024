package funcional_iterface.examples;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipoT e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtar so elementos do Stream com base em alguma condição
 */

public class PredicateExample {
    public static void main(String[] args) {
        //Criar um alista de palavras
        List<String> palavras  = Arrays.asList("Java","Kotlin","Python","JavaScript","C","Go","Ruby");

        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        // Predicate<String> maisDeCincoCaracteres = p -> p.length() > 5;
        
        //Usar o Steam para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //imprimir cada palavra que passou no filtro
        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
    
}
