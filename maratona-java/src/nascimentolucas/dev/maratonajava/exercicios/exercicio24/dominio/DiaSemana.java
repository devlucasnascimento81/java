package nascimentolucas.dev.maratonajava.exercicios.exercicio24.dominio;

public enum DiaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public boolean isFimDeSemana(){
        return this ==  SABADO || this == DOMINGO;
    }


}
