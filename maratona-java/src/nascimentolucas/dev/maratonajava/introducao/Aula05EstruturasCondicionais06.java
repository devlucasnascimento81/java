package nascimentolucas.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Ultilizado Dados os valores de 1 a 7, imprima se é dia útil ou fim de semana
        // considerando 1 como domingo
        byte dia = 1;
        switch (dia) {
            default:
                System.out.println("Inválido");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }
    }
}
