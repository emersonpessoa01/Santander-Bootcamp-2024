package var.tiposdevariaveis;

/**
 * tiposVariaveis
 */
public class TiposVariaveis {

    public static void main(String[] args) {
        int idade = 20;
        double salarioMinino = 1000.00;
        String nome = "Emerson";
        char sexo = 'M';
        boolean ativo = true;

        short numeroCurto = 1;
        short numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        final double VALOR_DE_PI = 3.14;

        System.out.println(idade);
        System.out.println(salarioMinino);
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(ativo);
        System.out.println(numeroCurto);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto2);
        System.out.println(VALOR_DE_PI);
    }
}