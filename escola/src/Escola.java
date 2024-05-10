
public class Escola {
    public static void main(String[] args) {
        // Aluno aluno1 = new Aluno();
        // aluno1.nome = "Emerson";
        // aluno1.idade = 20;

        // System.out.println("O aluno " + aluno1.nome + " tem " + aluno1.idade + " anos
        // ");

        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }
}
