package nascimentolucas.dev.maratonajava.exercicios.exercicio28.dominio;

public class Partida {
    private String timeCasa;
    private String timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Partida(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public String getResultado(){
        if (golsCasa > golsVisitante){
            return "Vitória do: "+getTimeCasa();
        } else if (golsCasa < golsVisitante) {
            return "Vitória do: "+getTimeVisitante();
        } else {
            return "Empate";
        }
    }

    public void imprime(){
        System.out.println("Time de casa: "+getTimeCasa());
        System.out.println("Total de gols: "+getGolsCasa());
        System.out.println("Time visitante: "+getTimeVisitante());
        System.out.println("Total de gols: "+getGolsVisitante());
        System.out.println(getResultado());
        System.out.println("----------------------------------------------------");
    }
}
