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
}
