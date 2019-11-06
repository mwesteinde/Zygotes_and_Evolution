package evolution;

import java.util.Set;

public class Evolution {

    /**
     * Compute the number of cells that survive the evolutionary process as
     * described in the problem statement assuming that a given cell dies during
     * the process.
     *
     * @param evolutionaryTree
     *            array that represents the normal evolution of the organism
     * @param deadCell
     *            the index in evolutionaryTree of the cell that dies
     * @requires - evolutionaryTree will contain exactly N elements, where N is
     *           an odd integer between 1 and 50, inclusive.
     *           - There will be exactly one "-1" element in evolutionaryTree.
     *           - Every element of evolutionaryTree will be between -1 and N-1, inclusive.
     *           - evolutionaryTree will form a binary tree.
     *           - deadCell will be between 0 and N-1, inclusive.
     *
     * @return the number of surviving cells in the mature organism
     */
    public static int numSurvivingCells(int[] evolutionaryTree, int deadCell) {
        // TODO: Implement this method
        return 0; // change this
    }

    /**
     * Compute the number of cells that survive the evolutionary process as
     * described in the problem statement assuming that a given cell dies during
     * the process.
     *
     * @param evolutionaryTree
     *            array that represents the normal evolution of the organism
     * @param deadCell
     *            the index in evolutionaryTree of the cell that dies
     * @requires - evolutionaryTree will contain exactly N elements, where N is
     *           an odd integer between 1 and 50, inclusive.
     *           - There will be exactly one "-1" element in evolutionaryTree.
     *           - Every element of evolutionaryTree will be between -1 and N-1, inclusive.
     *           - evolutionaryTree will form a binary tree.
     *           - deadCell will be between 0 and N-1, inclusive.
     *
     * @return the set of surviving cells in the mature organism
     */
    public static Set<Integer> getSurvivingCells(int[] evolutionaryTree,
                                                 int deadCell) {
        // TODO: Implement this method
        return null; // change this
    }

}
