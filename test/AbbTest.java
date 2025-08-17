package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import abb.facil.*;
import abb.medio.ZigzagLevelOrder;
import helpers.TreeNode;
import test.testHelpers.helpers.AbbHelper;

public class AbbTest {

    @Test
    public void testSortedArrayToBST_Case1() {
        SortedArrayToBST converter = new SortedArrayToBST();
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode result = converter.sortedArrayToBST(nums);

        // Árbol esperado: [0,-10,5,null,-3,null,9]
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.right = new TreeNode(5);
        expected.left.right = new TreeNode(-3);
        expected.right.right = new TreeNode(9);

        assertTrue(AbbHelper.areTreesEqual(expected, result));
    }

    @Test
    public void testSortedArrayToBST_Case2() {
        SortedArrayToBST converter = new SortedArrayToBST();
        int[] nums = { 1, 3 };
        TreeNode result = converter.sortedArrayToBST(nums);

        // Árbol esperado: [1,3]
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(3);

        assertTrue(AbbHelper.areTreesEqual(expected, result));
    }

    @Test
    public void testMaxDepth() {
        MaxDepth md = new MaxDepth();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        assertEquals(3, md.maxDepth(root1));

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        assertEquals(2, md.maxDepth(root2));
    }

    @Test
    public void testZigzagLevelOrder() {
        ZigzagLevelOrder zzlo = new ZigzagLevelOrder();

        // Test case 1: [3,9,20,null,null,15,7] -> [[3],[20,9],[15,7]]
        TreeNode root1 = AbbHelper.createTreeFromArray(new Integer[] { 3, 9, 20, null, null, 15, 7 });
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20, 9),
                Arrays.asList(15, 7));
        assertEquals(expected1, zzlo.zigzagLevelOrder(root1));

        // Test case 2: [1] -> [[1]]
        TreeNode root2 = AbbHelper.createTreeFromArray(new Integer[] { 1 });
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1));
        assertEquals(expected2, zzlo.zigzagLevelOrder(root2));

        // Test case 3: [] -> []
        TreeNode root3 = AbbHelper.createTreeFromArray(new Integer[] {});
        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, zzlo.zigzagLevelOrder(root3));

        // Test case 4: [1,2,3,4,5] -> [[1],[3,2],[4,5]]
        TreeNode root4 = AbbHelper.createTreeFromArray(new Integer[] { 1, 2, 3, 4, 5 });
        List<List<Integer>> expected4 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5));
        assertEquals(expected4, zzlo.zigzagLevelOrder(root4));

        // Test case 5: [0,2,4,1,null,3,-1,5,1,null,6,null,8] ->
        // [[0],[4,2],[1,3,-1],[8,6,1,5]]
        TreeNode root5 = AbbHelper.createTreeFromArray(new Integer[] { 0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8 });
        List<List<Integer>> expected5 = Arrays.asList(
                Arrays.asList(0),
                Arrays.asList(4, 2),
                Arrays.asList(1, 3, -1),
                Arrays.asList(8, 6, 1, 5));
        assertEquals(expected5, zzlo.zigzagLevelOrder(root5));
    }

}
