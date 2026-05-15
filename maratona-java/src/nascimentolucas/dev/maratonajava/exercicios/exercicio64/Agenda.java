package nascimentolucas.dev.maratonajava.exercicios.exercicio64;

import java.util.HashMap;

public class Agenda {

    private HashMap<String, String> contato = new HashMap<>();

    public void adicionarContato(String nomes, String telefone){
        if (nomes == null || nomes.isEmpty() || telefone == null || telefone.isEmpty()){
            throw new IllegalArgumentException("Erro: nome e telefone não pode ser vazio");
        }
        contato.put(nomes, telefone);
    }

    public void removerContato(String nome){
        if (!contato.containsKey(nome)) {
            throw new IllegalArgumentException("contato não encontrado: " + nome);
        }
        contato.remove(nome);
    }

    public boolean buscarContato(String nome){
        return contato.containsKey(nome);
    }

    public void listarContatos(){
        for (var entry : contato.entrySet()){
            System.out.println("Nome: " + entry.getKey() + " | telefone: " + entry.getValue());
        }
    }
}
