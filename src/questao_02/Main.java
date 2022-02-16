package questao_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution_02 solution_02 = new Solution_02();

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        int output = solution_02.checkPassword(password);

        System.out.println(output);
    }
}
