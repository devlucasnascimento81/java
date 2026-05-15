package nascimentolucas.dev.maratonajava.exercicios.exercicio64;

import java.util.Scanner;

public class GerenciadorTarefasTest {
    public static void main(String[] args) {

        try {
            GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Escolha uma opção abaixo: ");
                System.out.println("Digite: 0 para encerrar o programa.");
                System.out.println("Digite: 1 para adicionar uma nova tarefa.");
                System.out.println("Digite: 2 para remover uma tarefa.");
                System.out.println("Digite: 3 para buscar uma terfa.");
                System.out.println("Digite: 4 para Listar todas as tarefas.");
                String entrada = scanner.nextLine();
                switch (entrada) {
                    case "0":
                        System.out.println("Encerrando programa...");
                        scanner.close();
                        return;
                    case "1":
                        System.out.println("Qual tarefa você gostaria de adicionar?");
                        String addTarefa = scanner.nextLine();
                        gerenciadorTarefas.adicionarTarefas(addTarefa);
                        break;
                    case "2":
                        System.out.println("Qual tarefa você gostaria de remover?");
                        String removeTarefa = scanner.nextLine();
                        gerenciadorTarefas.removerTarefas(removeTarefa);
                        break;
                    case "3":
                        System.out.println("Qual tarefa você gostaria de buscar?");
                        String buscaTarefa = scanner.nextLine();
                        gerenciadorTarefas.buscarTarefa(buscaTarefa);
                        break;
                    case "4":
                        System.out.println("Listando todas tarefas existentes...");
                        gerenciadorTarefas.listarTarefas();
                        break;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
