package nascimentolucas.dev.maratonajava.introducao;
/*
Prática

 crie variáveis para os campos descritos abaixo entre <> e immprima a seguite mensagem:
 eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Patolino";
        String endereco = "Av Brasil n124";
        double salario = 8600.80;
        String data = "30/01/2026";
        String relatorio = "Eu " +nome+ ", morando no endereço: " +endereco+ ", confirmo que recebi meu salário no valor de: R$" +salario+ " na data: " +data+".";

        System.out.println(relatorio);
    }
}
