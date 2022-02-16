package questao_02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Solution_02 {

    // 1) criados atributos para:
    // 1.1) identificar numero de caracteres necessarios apra alcancar a quantidade de 6
    // 1.2) identificar o numero de caracteres necessarios apra atender todos os requisitos
    // 1.3) armazenar patterns necessários para identificar na senha informada os caracteres exigidos nos requisitos
    private int missingChars;
    private int requiredChars;
    private List<Pattern> regexList;

    // 2) construtor com valores iniciais dos atributos
    public Solution_02() {
        this.missingChars = 6;
        this.requiredChars = 0;
        this.regexList = new ArrayList<>();
            regexList.add(Pattern.compile(".*[A-Z].*"));
            regexList.add(Pattern.compile(".*[a-z].*"));
            regexList.add(Pattern.compile(".*\\d.*"));
            regexList.add(Pattern.compile(".*[!@#$%^&*()\\-+].*"));
    }

    // 3) metodo para checar o password informado
    // 3.1) percorri os elementos do array de regexes para buscar correspondência destes com a senha informada pelo usuário. a cada falta de correspondência, será adicionado 1 ao número de caracteres requeridos
    // 3.2) por fim, caso o número de caracteres faltantes para alcançar 6 seja superior ao número de caracteres requeridos para atender os requisitos específicos da senha até então, o número de caracteres requeridos passará a ser aquele armanezado em caracteres faltantes
    public int checkPassword(String password){

        for (Pattern regex : regexList) {
            if (!regex.matcher(password).matches())
                requiredChars++;
        }

        if (missingChars - password.length() > requiredChars)
            requiredChars = missingChars;

        return requiredChars;
    }
}
