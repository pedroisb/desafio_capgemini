package questao_01;


//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String a = "*";

        for (int i = 1; i <= n ; i++) {

            System.out.printf("%"+n+"s%n", a);
            a += "*";
        }
    }
}

// adicionar testes unitários com JUnit
// adicionar mensagem de erro caso input seja algo diverso de número inteiro superior a 0