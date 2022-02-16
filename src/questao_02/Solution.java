package questao_02;


//Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

//        ● Possui no mínimo 6 caracteres.          -> 6 char
//        ● Contém no mínimo 1 digito.              -> 1 int
//        ● Contém no mínimo 1 letra em minúsculo.  -> 1 char lowerCase
//        ● Contém no mínimo 1 letra em maiúsculo.  -> 1 char upperCase
//        ● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+    -> 1 char dentre estes

// Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


import java.util.Scanner;

public class Solution {

    // ler input
    // buscar por certos caracteres no input

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //BufferedReader?
        
        String password = scanner.nextLine();
    }
}
