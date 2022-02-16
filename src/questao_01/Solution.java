package questao_01;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 1) criada variavel a para armazenar string "*"
        String a = "*";

        // 2) bloco de código deverá ser iterado n vezes, correspondente ao número informado pelo usuário. ao fim de cada iteração, será adicionado um "*" à String a
        // 2.1) formatei a mensagem a ser exibida para alinhar os asteriscos à direita, como consta da imagem do documento contendo o desafio. para isso, determinei que cada string a ser exibida deveria ter um número de caracteres n, correspondente ao inteiro informado pelo usuário
        for (int i = 1; i <= n ; i++) {
            System.out.printf("%"+n+"s%n", a);
            a += "*";
        }
    }
}

// adicionar testes unitários com JUnit
// adicionar mensagem de erro caso input seja algo diverso de número inteiro superior a 0