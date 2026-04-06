package nascimentolucas.dev.maratonajava.exercicios.exercicio45;

import java.util.Random;

public class Jokepo {
    public static String verficarVencedor(Jogada jogador, Jogada computador) {
        switch (jogador) {
            case PEDRA -> {
                if (computador == Jogada.PAPEL) return "computador vence!";
                if (computador == Jogada.TESOURA) return "jogador vence!";
                return "empate";
            }
            case PAPEL -> {
                if (computador == Jogada.TESOURA) return "computador vence!";
                if (computador == Jogada.PEDRA) return "jogador vence";
                return "empate";
            }
            case TESOURA -> {
                if (computador == Jogada.PEDRA) return "computador vence!";
                if (computador == Jogada.PAPEL) return "jogador vence";
                return "empate";
            }
            default -> {
                return "Jogada inválida";
            }
        }
    }

    public static void main(String[] args) {
        Jogada[] jogadas = Jogada.values();

        int pontosJogador = 0;
        int pontosComputador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("----- Rodada " + i + " -----");
            Jogada computador = jogadas[new Random().nextInt(jogadas.length)];
            System.out.println("Computador: " + computador);
            Jogada jogador = Jogada.PEDRA;
            System.out.println("Jogador: " + jogador);
            String resultado = verficarVencedor(jogador, computador);
            System.out.println(resultado);
            if (resultado.equals("jogador vence!")) {
                pontosJogador++;
            } else if (resultado.equals("computador vence!")) {
                pontosComputador++;
            }
        }

        System.out.println("------ PLACAR ------");
        System.out.println("Pontos jogador: " + pontosJogador);
        System.out.println("Pontos computador: " + pontosComputador);


    }


}
