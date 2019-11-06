package evolution;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashSet;
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
        Set<Integer> survivors = new HashSet<>();
        int count = 0;
        Node n =  new Node(-1);

        if (deadCell == 0) {
            return 0;
        }

        for (int i = 0; i < evolutionaryTree.length; i++) {
            if (evolutionaryTree[i] == -1) {
                n = new Node(i);
                makeTree(n, evolutionaryTree);
            }
        }

        killCell(deadCell, n);
        countCells(n, survivors);










        return survivors.size();
    }

    private static void killCell(int index, Node root) {
        boolean sentinel = true;
        if (root.left != null) {
            if (root.left.value == index) {
                root.left = null;
                sentinel = false;
            }
        }
        if (root.right != null) {
            if (root.right.value == index) {
                root.right = null;
                sentinel = false;
            }
        }


        if (sentinel) {
            if (root.left != null) {
                killCell(index, root.left);
            }
            if (root.right != null) {
                killCell(index, root.right);
            }
        }
    }

    private static void countCells(Node root, Set<Integer> survivors) {
        if (root.left == null && root.right == null) {
            survivors.add(root.value);
        } else {
            if (root.left != null) {
                countCells(root.left, survivors);
            }
            if (root.right != null) {
                countCells(root.right, survivors);
            }
        }
    }

    private static void makeTree(Node root, int[] evolutionaryTree) {
        for (int i = 0; i < evolutionaryTree.length; i++) {
            if (evolutionaryTree[i] == root.value) {
                Node n = new Node(i);
                if (root.left == null) {
                    root.left = n;
                } else if (root.right == null) {
                    root.right = n;
                }
             makeTree(n, evolutionaryTree);
            }
        }

    }


    private static class Node { //Source: https://www.baeldung.com/java-binary-tree
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
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
        Set<Integer> survivors = new HashSet<>();

        Node n =  new Node(-1);

        if (deadCell == 0) {
            return survivors;
        }

        for (int i = 0; i < evolutionaryTree.length; i++) {
            if (evolutionaryTree[i] == -1) {
                n = new Node(i);
                makeTree(n, evolutionaryTree);
            }
        }

        killCell(deadCell, n);
        countCells(n, survivors);


        return survivors; // change this
    }

}
