package questao_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_02Test {

    private Solution_02 solution_02 = new Solution_02();


    @Test
    public void case01() {
        assertEquals(0, solution_02.checkPassword("acbD1!"));
    }

    @Test
    public void case02() {
        assertEquals(1, solution_02.checkPassword("%zu1D"));
    }

    @Test
    public void case03() {
        assertEquals(2, solution_02.checkPassword("aao321bxc"));
    }

    @Test
    public void case04() {
        assertEquals(3, solution_02.checkPassword("aobeaogbaeo"));
    }

    @Test
    public void case05() {
        assertEquals(3, solution_02.checkPassword("11234789"));
    }

    @Test
    public void case06() {
        assertEquals(4, solution_02.checkPassword("///////"));
    }

    @Test
    public void case07() {
        assertEquals(6, solution_02.checkPassword(""));
    }
}