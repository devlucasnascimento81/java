package nascimentolucas.dev.maratonajava.exercicios.exercicio59;

public class Search {

    public static int buscar(int[] array, int alvo){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if (array[i] == alvo){
                return i;
            }
        }
        throw new IllegalArgumentException("Elemento " + alvo + " não encontrado no array");
    }

    public static void main(String[] args) {

        int[] nums = {8, 3, 6, 2, 5};
        try {
            int indice = buscar(nums,5);
            System.out.println("Encontrado no indice: " + indice);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
