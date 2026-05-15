package nascimentolucas.dev.maratonajava.exercicios.exercicio64;

import java.util.Scanner;

public class AgendaTest {
    public static void main(String[] args) {
        try {
            Agenda agenda = new Agenda();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Escolha uma opção abaixo: ");
                System.out.println("Digite: 0 para encerrar o programa.");
                System.out.println("Digite: 1 para adicionar um novo contato.");
                System.out.println("Digite: 2 para remover um contato.");
                System.out.println("Digite: 3 para buscar um contato.");
                System.out.println("Digite: 4 para Listar todos os contatos.");
                String entrada = scanner.nextLine();

                switch (entrada){
                    case "0" :
                        System.out.println("encerrando programa...");
                        return;
                    case "1" :
                        System.out.print("nome: ");
                        String nomeContato = scanner.nextLine();
                        System.out.print("número: ");
                        String numContato = scanner.nextLine();
                        agenda.adicionarContato(nomeContato, numContato);
                        break;
                    case "2" :
                        System.out.print("nome do contato que deseja remover: ");
                        String removeNome = scanner.nextLine();
                        agenda.removerContato(removeNome);
                        break;
                    case "3" :
                        System.out.print("nome do contato que deseja buscar: ");
                        String bucarContato = scanner.nextLine();
                        agenda.buscarContato(bucarContato);
                        break;
                    case "4" :
                        System.out.println("Listando todos os seus contatos salvos...");
                        agenda.listarContatos();
                }
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}


