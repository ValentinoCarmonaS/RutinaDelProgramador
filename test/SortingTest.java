package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sorting.facil.*;

public class SortingTest {
    
    @Test
    public void testMajorityElement() {
        MajorityElement me = new MajorityElement();

        assertEquals(3, me.majorityElement(new int[]{3,2,3}));
        assertEquals(2, me.majorityElement(new int[]{2,2,1,1,1,2,2}));
        assertEquals(9, me.majorityElement(new int[]{10,9,9,9,10}));
    }
}
