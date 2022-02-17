package questao_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_03 {

    // 1)       criados atributos para armanezar o numero de anagramas encontrados e de substrings contida na string passada como paramatro
    private int anagrams;
    private List<String> allSubstrings;

    // 2)       funcao construtora com valores inicais dos atributos
    public Solution_03() {
        this.anagrams = 0;
        this.allSubstrings = new ArrayList<>();
    }

    // 3)       metodo utilizado para contar anagramas
    // 3.1)     tratei o input e o armazenei em lowercase, para evitar distincao entre maiusculas e minusculas
    // 3.3)     obtive todas as substrings da string input e armazena-las em um array
    // 3.3)     comparei as substrings obtidas entre si
    // 3.3.1)   a primeira clausula exigiu elementos com indices diferentes, de modo a evitar a comparacao de um elemento consigo mesmo
    // 3.3.2)   segunda clausula comparou length, pois elementos com quantidade de caracteres distintas não podem ser anagramas entre si
    // 3.3.3)   tratei as substrings, transformando ambas em arrays de chars e as ordenei, para, entao, compara-las.
    //          em caso positivo, sera adicionado 1 na contagem de anagramas
    // 3.4)     Por fim, se faz necessario dividir o numero obtido pela metade, para obter a quantidade real de anagramas
    //          deve-se atentar que o algoritmo acima considera array[i] == array [j] e array[j] == array[i] como duas hipoteses distintas
    public int countAnagrams(String input){

        String param = input.toLowerCase();

        for (int i = 0; i < param.length(); i++) {
            for (int j = 0; j < param.length() - i; j++) {
                String element = param.substring(j, j + (i+1));
                allSubstrings.add(element);
            }
        }

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

        anagrams = anagrams/2;

        return anagrams;
    }
}
