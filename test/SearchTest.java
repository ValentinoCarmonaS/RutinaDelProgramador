package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helpers.TreeNode;
import search.facil.*;
import search.medio.*;

public class SearchTest {

    @Test
    public void testSearchInsertPosition() {
        SearchInsertPosition sip = new SearchInsertPosition();

        assertEquals(2, sip.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
        assertEquals(1, sip.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
        assertEquals(4, sip.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
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

    @Test
    public void testSearchRange() {
        SearchRange sr = new SearchRange();

        assertArrayEquals(new int[] { 3, 4 }, sr.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
        assertArrayEquals(new int[] { -1, -1 }, sr.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
        assertArrayEquals(new int[] { -1, -1 }, sr.searchRange(new int[] {}, 0));
    }

    @Test
    public void testSearch() {
        Search s = new Search();

        assertEquals(4, s.search(new int[] { -1,0,3,5,9,12 }, 9));
        assertEquals(-1, s.search(new int[] { -1,0,3,5,9,12 }, 2));
    }
}
