package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.livroList.add(livro);
    }

    public void removerLivros(String titulo) {
        if (!livroList.isEmpty()) {
            List<Livro> livrosParaRemover = new ArrayList<>();
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosParaRemover.add(l);
                }
            }
            livroList.removeAll(livrosParaRemover);
        } else {
            System.out.println("O catálogo está vazio");
        }

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(l);
                }
            }

        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosEncontrados.add(l);
                }
            }
        }
        return livrosEncontrados;

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;
    }

    @Override
    public String toString() {
        return "CatalogoLivros [livroList=" + livroList + "]";
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1","Autor 1",2020);
        catalogoLivros.adicionarLivros("Livro 1","Autor 2",2021);
        catalogoLivros.adicionarLivros("Livro 2","Autor 2",2022);
        catalogoLivros.adicionarLivros("Livro 3","Autor 3",2023);
        catalogoLivros.adicionarLivros("Livro 4","Autor 4",1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}