package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import search.*;

public class Search {
    
    @Test
    public void testSearchInsertPosition() {
        SearchInsertPosition sip = new SearchInsertPosition();

        assertEquals(2, sip.searchInsert(new int[] {1,3,5,6}, 5));
        assertEquals(1, sip.searchInsert(new int[] {1,3,5,6}, 2));
        assertEquals(4, sip.searchInsert(new int[] {1,3,5,6}, 7));
    }
}
