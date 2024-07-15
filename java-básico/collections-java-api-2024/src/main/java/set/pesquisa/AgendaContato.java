import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    // atributo
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        this.contatoSet.add(contato);

    }

    public void exibirContato() {
        // for (Contato c : contatoSet) {
        // System.out.println(c.getNome());
        // System.out.println(c.getNumero());
        // }
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Emerson", 123456);
        agendaContatos.adicionarContato("Emerson", 5665);
        agendaContatos.adicionarContato("Emerson Pessoa", 11111111);
        agendaContatos.adicionarContato("Emerson DIO", 654987);
        agendaContatos.adicionarContato("Luciene Ferreira", 11111111);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Emerson"));

        System.out.println(agendaContatos.atualizarNumeroContato("Luciene Ferreita",
                5555555));
    }

}
