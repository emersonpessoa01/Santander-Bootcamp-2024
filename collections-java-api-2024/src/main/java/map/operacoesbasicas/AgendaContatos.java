package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
        // System.out.println(agendaContatoMap);

    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            this.agendaContatoMap.remove(nome);
        } else {
            System.out.println("Não há contatos para serem removidos");
        }

    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Emerson", 123456789);
        agendaContatos.adicionarContato("Emerson", 56789);
        agendaContatos.adicionarContato("Emerson Pessoa", 1111111);
        agendaContatos.adicionarContato("Emerson DIO", 654987);
        agendaContatos.adicionarContato("Luciene Ferreira", 11111111);
        agendaContatos.adicionarContato("Emerson", 4444444);

        agendaContatos.exibirContato();
        agendaContatos.removerContato("Luciene Ferreira");
        agendaContatos.exibirContato();

        System.out.println("O número é:" + agendaContatos.pesquisarPorNome("Emerson DIO"));

    }

}
