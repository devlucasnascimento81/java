package nascimentolucas.dev.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 21;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a compra de bebidas alcólicas");
        }else {
            System.out.println("Venda não autorizada");
        }

    }
}
