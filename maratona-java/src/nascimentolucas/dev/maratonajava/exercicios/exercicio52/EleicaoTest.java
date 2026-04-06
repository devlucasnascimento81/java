package nascimentolucas.dev.maratonajava.exercicios.exercicio52;

import java.util.Random;

public class EleicaoTest {
    public static void main(String[] args) {
        Urna urna = new Urna();
        Candidato[] candidatos = Candidato.values();

        for (int i = 0; i < 10; i++){
            Candidato voto = candidatos[new Random().nextInt(candidatos.length)];
            urna.votar(voto);
        }
        System.out.println(urna.getVencedor());

    }
}
