package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import search.facil.*;

public class SearchTest {
    
    @Test
    public void testSearchInsertPosition() {
        SearchInsertPosition sip = new SearchInsertPosition();

        assertEquals(2, sip.searchInsert(new int[] {1,3,5,6}, 5));
        assertEquals(1, sip.searchInsert(new int[] {1,3,5,6}, 2));
        assertEquals(4, sip.searchInsert(new int[] {1,3,5,6}, 7));
    }

    @Test
    public void testCountTreeNodes() {
        CountTreeNodes ctn = new CountTreeNodes();
        
        TreeNode ab4 = new TreeNode(4);
        TreeNode ab5 = new TreeNode(5);
        TreeNode ab6 = new TreeNode(6);

        TreeNode ab2 = new TreeNode(2, ab4, ab5);
        TreeNode ab3 = new TreeNode(3, ab6, null);

        TreeNode ab1 = new TreeNode(1, ab2, ab3);

        assertEquals(6, ctn.countNodes(ab1));
    }
}
