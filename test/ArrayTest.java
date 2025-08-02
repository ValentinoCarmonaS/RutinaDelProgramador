package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import array.facil.*;

public class ArrayTest {
    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix array = new LongestCommonPrefix();
        String test1 = array.longestCommonPrefix(new String[] {"flower","flow","flight"});
        String test2 = array.longestCommonPrefix(new String[] {"dog","racecar","car"});

        assertEquals("fl", test1);
        assertEquals("", test2);
    }

    @Test
    public void testTwoSum() {
        TwoSum array = new TwoSum();
        int[] test1 = array.twoSum(new int[] {2,7,11,15}, 9);
        int[] test2 = array.twoSum(new int[] {3,2,4}, 6);
        int[] test3 = array.twoSum(new int[] {3,3}, 6);

        assertArrayEquals(new int[] {0,1}, test1);
        assertArrayEquals(new int[] {1,2}, test2);
        assertArrayEquals(new int[] {0,1}, test3);
    }

    @Test
    public void testRemoveElement() {
        RemoveElement re = new RemoveElement();
        int[] array1 = new int[]{3,2,2,3};
        int[] array2 = new int[]{0,1,2,2,3,0,4,2};
        int[] array3 = new int[]{2};
        int[] array4 = new int[]{3};

        int[] array5 = new int[]{2,2};
        int[] array6 = new int[]{0,1,3,0,4};

        assertEquals(2, re.removeElement(array1, 3));
        for (int i = 0; i < 2; i++) {
            assertEquals(array5[i], array1[i]);
        }

        assertEquals(5, re.removeElement(array2, 2));
        for (int i = 0; i < 5; i++) {
            assertEquals(array6[i], array2[i]);
        }

        assertEquals(1, re.removeElement(array3, 3));
        assertEquals(0, re.removeElement(array4, 3));
    }
}
