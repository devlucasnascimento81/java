package nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.test;

import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();

        estudante01.nome = "Leorio";
        estudante01.idade = 26;
        estudante01.sexo = 'M';
        estudante01.habilidade = "Warp Punch";

        estudante02.nome = "Hisoka";
        estudante02.idade = 27;
        estudante02.sexo = 'M';
        estudante02.habilidade = "Bungee Gum";

        estudante03.nome = "gim freaks";
        estudante03.idade = 38;
        estudante03.sexo = 'M';
        estudante03.habilidade = "Copy";

        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();
    }
}
