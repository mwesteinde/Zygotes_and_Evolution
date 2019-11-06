package evolution;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class EvolutionTest {

    @Test
    public void test1() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 2;
        assertEquals(2, Evolution.numSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test2() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 1;
        assertEquals(1, Evolution.numSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test3() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 0;
        assertEquals(0, Evolution.numSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test4() {
        int[] evolutionaryTree = { -1, 0, 0, 2, 2, 4, 4, 6, 6 };
        int deadCell = 4;
        assertEquals(2, Evolution.numSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test5() {
        int[] evolutionaryTree = { 26, 2, 32, 36, 40, 19, 43, 24, 30, 13, 21,
                14, 24, 21, 19, 4, 30, 10, 44, 12, 7, 32, 17, 43, 35, 18, 7,
                36, 10, 16, 5, 38, 35, 4, 13, -1, 16, 26, 1, 12, 2, 5, 18, 40,
                1, 17, 38, 44, 14 };
        int deadCell = 24;
        assertEquals(14,
                Evolution.numSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test1Set() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 2;
        Set<Integer> testSet = new HashSet<>();
        testSet.add(3);
        testSet.add(4);
        assertEquals(testSet, Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test2Set() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 1;
        Set<Integer> testSet = new HashSet<>();
        testSet.add(2);
        assertEquals(testSet, Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test3Set() {
        int[] evolutionaryTree = { -1, 0, 0, 1, 1 };
        int deadCell = 0;
        Set<Integer> testSet = new HashSet<>();
        assertEquals(testSet, Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test4Set() {
        int[] evolutionaryTree = { -1, 0, 0, 2, 2, 4, 4, 6, 6 };
        int deadCell = 4;
        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        testSet.add(3);
        assertEquals(testSet, Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }



    // Deliberately no tests have been provided for the method that returns a Set
    // Create a few tests of your own!

}
