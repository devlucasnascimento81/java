package nascimentolucas.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        byte dia = 5;

        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }

        String sexo = "F";
        switch (sexo){
            case "M":
                System.out.println("Homem");
            case "F":
                System.out.println("Mulher");
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
