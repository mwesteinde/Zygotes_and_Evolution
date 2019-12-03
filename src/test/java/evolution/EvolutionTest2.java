package evolution;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class EvolutionTest2 {

    @Test
    public void test1() {
        int[] evolutionaryTree = {26, 2, 32, 36, 40, 19, 43, 24, 30, 13, 21,
                14, 24, 21, 19, 4, 30, 10, 44, 12, 7, 32, 17, 43, 35, 18, 7,
                36, 10, 16, 5, 38, 35, 4, 13, -1, 16, 26, 1, 12, 2, 5, 18, 40,
                1, 17, 38, 44, 14};
        int deadCell = 24;
        HashSet<Integer> survivors = new HashSet<>(Arrays.asList(33, 34, 6, 9, 42, 45, 46, 47, 15, 22, 23, 25, 28, 31));
        assertEquals(survivors,
                Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test2() {
        int[] evolutionaryTree = {24, 42, 4, 30, 29, 43, 22, 15, 26, 36, 26, 16, 3, 22, 21, 41, 18, 16, 34, 41, 12, 29, 32, 30, 43, 15, 4, 38, 36, -1, 24, 42, 18, 6, 21, 38, 6, 17, 32, 17, 3, 34, 12, 14, 14};
        int deadCell = 24;
        HashSet<Integer> survivors = new HashSet<>(Arrays.asList(33, 2, 35, 5, 37, 39, 7, 8, 9, 10, 11, 44, 13, 19, 25, 27, 28));
        assertEquals(survivors,
                Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test3() {
        int[] evolutionaryTree = {9, 14, 13, 2, 2, -1, 14, 9, 13, 11, 11, 5, 10, 5, 10};
        int deadCell = 10;
        HashSet<Integer> survivors = new HashSet<>(Arrays.asList(0, 3, 4, 7, 8));
        assertEquals(survivors,
                Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test4() {
        int[] evolutionaryTree = {11, 17, 11, 5, 18, 23, 18, 23, 22, 0, 20, 22, 0, 20, 21, -1, 8, 2, 5, 2, 21, 15, 15, 8, 17};
        int deadCell = 0;
        HashSet<Integer> survivors = new HashSet<>(Arrays.asList(16, 1, 3, 19, 4, 6, 7, 24, 10, 13, 14));
        assertEquals(survivors,
                Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

    @Test
    public void test5() {
        int[] evolutionaryTree = {-1, 0, 0, 2, 2, 4, 4, 6, 6};
        int deadCell = 4;
        HashSet<Integer> survivors = new HashSet<>(Arrays.asList(1, 3));
        assertEquals(survivors,
                Evolution.getSurvivingCells(evolutionaryTree, deadCell));
    }

}
