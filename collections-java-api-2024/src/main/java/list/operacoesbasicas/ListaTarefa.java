package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método p/ adicionar elemento dentro do ArrayList
    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        this.tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        // this.tarefaList.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();

    }

    public void obterDescricoesTarefas() {
        for (Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "tarefas=" + tarefaList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Python");
        listaTarefa.removerTarefa("Estudar Java");
        listaTarefa.obterDescricoesTarefas();
        System.out.printf("O número total de lista de tarefa é %d \n", listaTarefa.obterNumeroTotalTarefas());

        System.out.println(listaTarefa.toString());

    }

}
