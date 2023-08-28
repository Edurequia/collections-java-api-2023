package list.java.list.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefas);
    }
}
