package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import abb.facil.*;
import helpers.TreeNode;

public class AbbTest {
    
    @Test
    public void testSortedArrayToBST_Case1() {
        SortedArrayToBST converter = new SortedArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode result = converter.sortedArrayToBST(nums);

        // Árbol esperado: [0,-10,5,null,-3,null,9]
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.right = new TreeNode(5);
        expected.left.right = new TreeNode(-3);
        expected.right.right = new TreeNode(9);

        assertTrue(areTreesEqual(expected, result));
    }

    @Test
    public void testSortedArrayToBST_Case2() {
        SortedArrayToBST converter = new SortedArrayToBST();
        int[] nums = {1, 3};
        TreeNode result = converter.sortedArrayToBST(nums);

        // Árbol esperado: [1,3]
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(3);

        assertTrue(areTreesEqual(expected, result));
    }

    // Método auxiliar para comparar dos árboles binarios que a su vez
    // prueba el que la clase IsSameTree funciona correctamente
    private boolean areTreesEqual(TreeNode a, TreeNode b) {
        IsSameTree ist = new IsSameTree();
        return ist.isSameTree(a, b);
    }
}
