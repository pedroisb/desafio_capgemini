package questao_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_01Test {

    private Solution_01 solution_01 = new Solution_01();
    private String asterisk;

    @Test
    public void case01() {
        assertEquals("", solution_01.pyramidBuilder(0));
    }

    @Test
    public void case02() {
        asterisk = String.format("%1s%n", "*");

        assertEquals(asterisk, solution_01.pyramidBuilder(1));
    }

    @Test
    public void case03() {
        asterisk =  String.format("%3s%n", "*") +
                    String.format("%3s%n", "**") +
                    String.format("%3s%n", "***");

        assertEquals(asterisk, solution_01.pyramidBuilder(3));
    }

    @Test
    public void case04() {
        asterisk =  String.format("%5s%n", "*") +
                    String.format("%5s%n", "**") +
                    String.format("%5s%n", "***") +
                    String.format("%5s%n", "****") +
                    String.format("%5s%n", "*****");

        assertEquals(asterisk, solution_01.pyramidBuilder(5));
    }
}