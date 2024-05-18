package main.list.operacoesbasicas;

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
        this.tarefaList.add(new Tarefa(descricao));
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
    public int obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        for (Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }
}
