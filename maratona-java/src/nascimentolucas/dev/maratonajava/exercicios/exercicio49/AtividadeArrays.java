package nascimentolucas.dev.maratonajava.exercicios.exercicio49;

public class AtividadeArrays {
    public static double getMaior(double[] valores){
        double maior = valores[0];
        for (int i = 1; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return maior;
    }

    public static double getMenor(double[] valores){
        double menor = valores[0];
        for (int i = 1; i < valores.length; i++){
            if (valores[i] < menor){
                menor = valores[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        double[] valores = {12.5, 4.5,58,2,33,4,59,438,302,849,835,919.92,324.2,12.1,1.1};

        System.out.println("Maior valor encontrado: "+AtividadeArrays.getMaior(valores));
        System.out.println("\n");
        System.out.println("Menor valor encontrado: "+AtividadeArrays.getMenor(valores));

    }

}
