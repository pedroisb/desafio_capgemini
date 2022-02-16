package questao_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int anagrams = 0;

        // 1) Decidi obter todas as substrings da string input e armazena-las em um array
        List<String> allSubstrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                String el = input.substring(j, j + (i+1));
                allSubstrings.add(el);
            }
        }

        // 2) em seguida, comparei as substrings obtidas entre si
        // 2.1) primeira clausula exigiu elementos com indices diferentes, de modo a evitar comparar um elemento consigo mesmo
        // 2.2) segunda clausula comparou length, para poupar processamento. elementos com quantidade de caracteres distinta não podem ser anagramas entre si
        // 2.3) entao, tratei as substrings, transformando ambas em arrays de chars e ordenando os chars, para, entao, compara-las. em caso positivo, sera adicionado 1 na contagem de anagramas
        for (int i = 0; i < allSubstrings.size(); i++) {
            for (int j = 0; j < allSubstrings.size(); j++) {
                if (i != j) {
                    if (allSubstrings.get(i).length() == allSubstrings.get(j).length()) {
                        char[] iChars = allSubstrings.get(i).toCharArray();
                        char[] jChars = allSubstrings.get(j).toCharArray();
                        Arrays.sort(iChars);
                        Arrays.sort(jChars);
                        if (Arrays.equals(iChars, jChars)) {
                            anagrams++;
                        }
                    }
                }
            }
        }

        // 3) Por fim, se faz necessario dividir o numero obtido pela metade, para obter a quantidade real de anagramas
        // deve-se atentar que o algoritmo acima considera array[i] == array [j] e array[j] == array[i] como duas hipoteses distintas
        anagrams = anagrams/2;

        System.out.println(anagrams);
    }
}
