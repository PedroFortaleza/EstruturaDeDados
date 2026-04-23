package gestaoTarefas;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<Tarefa>();

        filaTarefa.add(new Tarefa("Responder Email", 4));
        filaTarefa.add(new Tarefa("Corrigir Bugs", 2));
        filaTarefa.add(new Tarefa("Planejamento Sprint", 3));

        System.out.println("Tarefas por ordem de prioridade");
        while (!filaTarefa.isEmpty()) {
            System.out.println(filaTarefa.poll());
        }
    }
}
