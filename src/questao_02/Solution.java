package questao_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        // 1) criei variaveis para identificar o numero de caracteres necessarios para alcançar 6 e outra para receber o numero de caracteres necessários para atender todos os requisitos
        int charsMissing = 6 - password.length();
        int requiredChars = 0;

        // 2) criei um arraylist com 4 regexes, correspondentes aos requisitos exigidos pela senha: letra maiúscula, letra minúscula, digito e caractere especial
        List<Pattern> regexes= new ArrayList<Pattern>();
        regexes.add(Pattern.compile(".*[A-Z].*"));
        regexes.add(Pattern.compile(".*[a-z].*"));
        regexes.add(Pattern.compile(".*\\d.*"));
        regexes.add(Pattern.compile(".*[!@#$%^&*()\\-+].*"));

        // 3) percorri os elementos do array de regexes para buscar correspondência destes com a senha informada pelo usuário. a cada falta de correspondência, será adicionado 1 ao número de caracteres requeridos
        for (Pattern regex : regexes) {
            if (!regex.matcher(password).matches())
                requiredChars++;
        }

        // 4) por fim, caso o número de caracteres faltantes para alcançar 6 seja superior ao número de caracteres requeridos para atender os requisitos específicos da senha até então, o número de caracteres requeridos passará a ser aquele armanezado em caracteres faltantes
        if (charsMissing > requiredChars)
            requiredChars = charsMissing;

        System.out.println(requiredChars);
    }
}