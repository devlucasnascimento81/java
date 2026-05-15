package nascimentolucas.dev.maratonajava.exercicios.exercicio64;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas = new ArrayList<>();

    public void adicionarTarefas(String tarefa) {
        if (tarefa == null || tarefa.isEmpty()) {
            throw new IllegalArgumentException("tarefa não pode ser null ou vazia");
        }
        tarefas.add(tarefa);
    }

    public void removerTarefas(String tarefa) {
        if (!tarefas.contains(tarefa)) {
            throw new IllegalArgumentException("tarefa não encontrada: " + tarefa);
        }
        tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++){
            System.out.println((i + 1)+" - "+tarefas.get(i));
        }

    }

    public void buscarTarefa(String termo){
        ArrayList<String> resultado = new ArrayList<>();
        for (String tarefa : tarefas){
            if (tarefa.contains(termo)) {
                resultado.add(tarefa);
            }
        }
        resultado.forEach(System.out::println);
    }

}
