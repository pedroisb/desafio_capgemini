package questao_03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_03Test {

    Solution_03 solution_03 = new Solution_03();

    @Test
    public void case01() {
        assertEquals(8, solution_03.countAnagrams("Aprovacao"));
    }

    @Test
    public void case02() {
        assertEquals(4, solution_03.countAnagrams("Aprovação"));
    }

    @Test
    public void case03() {
        assertEquals(4, solution_03.countAnagrams("ooo"));
    }

    @Test
    public void case04() {
        assertEquals(0, solution_03.countAnagrams(""));
    }

    @Test
    public void case05() {
        assertEquals(0, solution_03.countAnagrams("abcde"));
    }

}