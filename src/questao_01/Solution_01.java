package questao_01;

public class Solution_01 {

    // 1)       criado atributo que recebera string "*\n"
    private String asterisk;
    private String pyramid;

    // 2)       metodo construtor que inicializa atributo como String vazia
    public Solution_01() {
        this.asterisk = "*";
        this.pyramid = "";
    }

    // 3)       metodo que adiciona asteriscos a piramide de saida
    // 3.1)     string de asteriscos formatada para alinha-los a direita, semelhante a imagem trazida como exemplo no desafio
    public String pyramidBuilder(int n){
        for (int i = 1; i <= n ; i++) {
            pyramid += String.format("%"+n+"s%n", asterisk);
            asterisk = asterisk + "*";
        }

        return pyramid;
    }
}
