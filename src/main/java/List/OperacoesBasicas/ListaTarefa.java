package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasparaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasparaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasparaRemover);
    }

    public int obternumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Elementos da lista: " + listaTarefa.obternumeroTotalTarefas());


        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("tarefa 4");

        listaTarefa.removerTarefa("tarefa 1");
        listaTarefa.obterDescricoesTarefas();

        System.out.println("Elementos da lista: " + listaTarefa.obternumeroTotalTarefas());
    }

}
