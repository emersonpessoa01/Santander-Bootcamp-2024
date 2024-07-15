package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // atributo
    private Map<Long, Produto> estoqueProdutosMap;
    // construtor

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long codigo, String nome, int quantidade, double preco) {
        Produto produtos = new Produto(nome, preco, quantidade);
        estoqueProdutosMap.put(codigo, produtos);

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoProdutoMaisCaro = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > precoProdutoMaisCaro) {
                    precoProdutoMaisCaro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutos(1L, "Produto A", 10, 5.0);
        estoque.adicionarProdutos(2L, "Produto B", 5, 10.0);
        estoque.adicionarProdutos(3L, "Produto C", 2, 15.0);
        estoque.adicionarProdutos(4L, "Produto D", 2, 20.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro " + estoque.obterProdutoMaisCaro());

    }
}
