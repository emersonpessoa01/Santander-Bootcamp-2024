package exemplo.emerson.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
     String primeiroNome = "Emerson";
     String segundoNome = "Pessoa";
     String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
     System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado o Método é: " + primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
