package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class conjuntoConvidados {
    // atributo
    private Set<Convidado> convidadoSet;

    public conjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // metodo
    public void adicionarConvidado(String nome, int codigoConvite) {
        Convidado convidado = new Convidado(nome, codigoConvite);
        this.convidadoSet.add(convidado);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            this.convidadoSet.remove(convidadoParaRemover);
        } else {
            System.out.println("A lista de convidados está vazio");
        }

    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        if (!convidadoSet.isEmpty()) {
            System.out.println(this.convidadoSet);
        } else {
            System.out.println("A lista de convidados está vazia");
        }
    }

    public static void main(String[] args) {
        conjuntoConvidados convidados = new conjuntoConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set de Convidados");

        convidados.adicionarConvidado("Convidado 1", 1);
        convidados.adicionarConvidado("Convidado 2", 2);
        convidados.adicionarConvidado("Convidado 3", 2);
        convidados.adicionarConvidado("Convidado 4", 3);

        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigoConvite(1);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set de Convidados");

        convidados.exibirConvidados();

    }

}
