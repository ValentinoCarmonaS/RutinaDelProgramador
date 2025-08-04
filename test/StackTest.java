package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import stack.facil.*;

public class StackTest {
    
    @Test
    public void testInorderTraversal() {
        InorderTraversal it = new InorderTraversal();
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        
        assertEquals(List.of(1,3,2), it.inorderTraversal(node1));

        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node5 = new TreeNode(5, node6, node7);
        node2 = new TreeNode(2, node4, node5);
        TreeNode node8 = new TreeNode(8, node9, null);
        node3 = new TreeNode(3, null, node8);
        node1 = new TreeNode(1, node2, node3);

        assertEquals(List.of(4,2,6,5,7,1,3,9,8), it.inorderTraversal(node1));
    }
}
