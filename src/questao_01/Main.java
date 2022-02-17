package questao_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution_01 solution_01 = new Solution_01();

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String output = solution_01.pyramidBuilder(input);

        System.out.println(output);
    }
}
