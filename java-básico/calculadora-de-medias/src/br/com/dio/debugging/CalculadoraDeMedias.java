package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {
            "Camila",
            "Lucas",
            "Bruna",
            "Pedro"
        };
        double media = calculaMediaDaTurma(alunos, scanner);
        System.out.printf("Média da turma %f", media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite a nota do aluno %s: ", alunos[i]);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
