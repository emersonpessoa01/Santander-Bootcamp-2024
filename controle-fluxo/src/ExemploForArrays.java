// ExemploFor.java
public class ExemploForArrays {
    public static void main(String[] args) {

        // for com Arrays
        // String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // for (int x = 0; x < alunos.length; x++) {
        //     System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        // }

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for (String aluno: alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

    }

}
