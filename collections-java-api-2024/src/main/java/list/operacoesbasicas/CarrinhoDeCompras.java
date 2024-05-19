package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // atributo
    private List<Item> itemList;

    // construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);

    }

    public void removerItem(String nome) {
        // this.itemList.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }

    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Caneta", 1.50, 10);
        carrinhoDeCompras.adicionarItem("Lápis", 2.50, 5);

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Caneta");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        System.out.println(carrinhoDeCompras.toString());
    }

}
