package questao_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution_03 solution_03 = new Solution_03();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int output = solution_03.countAnagrams(input);

        System.out.println(output);
    }
}
