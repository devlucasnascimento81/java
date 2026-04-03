package nascimentolucas.dev.maratonajava.exercicios.exercicio50;

public class ContagemElementos {
    public static int contarDuplicatas(int[] valores) {
        int contador = 0;

        for (int i = 0; i < valores.length; i++){
            for (int j = i + 1; j < valores.length; j++){
                if (valores[i] == valores[j]){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 2, 4, 1, 5, 3};

        System.out.println("Total de duplicatas: "+ContagemElementos.contarDuplicatas(valores));
    }

}

