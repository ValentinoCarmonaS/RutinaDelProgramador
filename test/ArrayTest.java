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
    public void testMergeSortedArray() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] array1 = new int[] {1,2,3,0,0,0};
        int[] array2 = new int[] {2,5,6};
        int[] array3 = new int[] {1};
        int[] array4 = new int[] {};
        int[] array5 = new int[] {0};
        int[] array6 = new int[] {1};

        msa.merge(array1, 3, array2, 3);
        msa.merge(array3, 0, array4, 0);
        msa.merge(array5, 0, array6, 1);

        assertArrayEquals(new int[] {1,2,2,3,5,6}, array1);
        assertArrayEquals(new int[] {1}, array3);
        assertArrayEquals(new int[] {1}, array5);
    }
}
