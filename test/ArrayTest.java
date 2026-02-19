package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import array.facil.*;
import array.medio.*;
import helpers.testHelpers.helpers.ArrayFromFile;

public class ArrayTest {
    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix array = new LongestCommonPrefix();
        String test1 = array.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
        String test2 = array.longestCommonPrefix(new String[] { "dog", "racecar", "car" });

        assertEquals("fl", test1);
        assertEquals("", test2);
    }

    @Test
    public void testTwoSumFacil() {
        array.facil.TwoSum array = new array.facil.TwoSum();
        int[] test1 = array.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] test2 = array.twoSum(new int[] { 3, 2, 4 }, 6);
        int[] test3 = array.twoSum(new int[] { 3, 3 }, 6);

        assertArrayEquals(new int[] { 0, 1 }, test1);
        assertArrayEquals(new int[] { 1, 2 }, test2);
        assertArrayEquals(new int[] { 0, 1 }, test3);
    }

    @Test
    public void testMergeSortedArray() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] array1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] array2 = new int[] { 2, 5, 6 };
        int[] array3 = new int[] { 1 };
        int[] array4 = new int[] {};
        int[] array5 = new int[] { 0 };
        int[] array6 = new int[] { 1 };

        msa.merge(array1, 3, array2, 3);
        msa.merge(array3, 0, array4, 0);
        msa.merge(array5, 0, array6, 1);

        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, array1);
        assertArrayEquals(new int[] { 1 }, array3);
        assertArrayEquals(new int[] { 1 }, array5);
    }

    @Test
    public void testRemoveElement() {
        RemoveElement re = new RemoveElement();
        int[] array1 = new int[] { 3, 2, 2, 3 };
        int[] array2 = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] array3 = new int[] { 2 };
        int[] array4 = new int[] { 3 };

        int[] array5 = new int[] { 2, 2 };
        int[] array6 = new int[] { 0, 1, 3, 0, 4 };

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

    @Test
    public void testTwoSumMedio() {
        array.medio.TwoSum sum = new array.medio.TwoSum();
        int[] test1 = sum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] test2 = sum.twoSum(new int[] { 2, 3, 4 }, 6);
        int[] test3 = sum.twoSum(new int[] { -1, 0 }, -1);
        int[] test4 = sum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] test5 = sum.twoSum(new int[] { 2, 3, 4, 6, 8, 16 }, 9);

        assertArrayEquals(new int[] { 1, 2 }, test1);
        assertArrayEquals(new int[] { 1, 3 }, test2);
        assertArrayEquals(new int[] { 1, 2 }, test3);
        assertArrayEquals(new int[] { 1, 2 }, test4);
        assertArrayEquals(new int[] { 2, 4 }, test5);
    }

    @Test
    public void testMinSubArrayLen() {
        MinSubArrayLen msal = new MinSubArrayLen();

        assertEquals(2, msal.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
        assertEquals(1, msal.minSubArrayLen(4, new int[] { 1, 4, 4 }));
        assertEquals(0, msal.minSubArrayLen(11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
        assertEquals(1, msal.minSubArrayLen(2, new int[] { 3, 1, 4, 3 }));
        assertEquals(4, msal.minSubArrayLen(10, new int[] { 2, 3, 1, 2, 4, 3 }));
    }

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates rd = new RemoveDuplicates();

        int[] array1 = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] array2 = new int[] { 1, 1, 2 };

        assertEquals(5, rd.removeDuplicates(array1));
        int[] array1Ans = new int[] { 0, 1, 2, 3, 4 };
        for (int i = 0; i < 5; i++) {
            assertEquals(array1Ans[i], array1[i]);
        }

        assertEquals(2, rd.removeDuplicates(array2));
        int[] array2Ans = new int[] { 1, 2 };
        for (int i = 0; i < 2; i++) {
            assertEquals(array2Ans[i], array2[i]);
        }
    }

    @Test
    public void testMaxArea() {
        MaxArea ma = new MaxArea();
        int[] test3;

        assertEquals(49, ma.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        assertEquals(1, ma.maxArea(new int[] { 1, 1 }));

        try {
            test3 = ArrayFromFile.arrayFromFile("ejercicios/helpers/testHelpers/txt/testMaxArea.txt");
            assertEquals(705634720, ma.maxArea(test3));
        } catch (IOException e) {
            fail("No pudo cargarse la prueba 3 de Max Area con error: " + e);
        }
    }

    @Test
    public void testSmallestEqual() {
        SmallestEqual se = new SmallestEqual();

        int[] array1 = { 0, 1, 2 };
        assertEquals(0, se.smallestEqual(array1));

        int[] array2 = { 4, 3, 2, 1 };
        assertEquals(2, se.smallestEqual(array2));

        int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        assertEquals(-1, se.smallestEqual(array3));
    }

    @Test
    public void testLargestTriangleArea() {
        LargestTriangleArea lta = new LargestTriangleArea();

        int[][] points1 = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } };
        int[][] points2 = { { 1, 0 }, { 0, 0 }, { 0, 1 } };
        int[][] points3 = { { 1, 0 }, { -1, -2 }, { -3, 1 } };
        int[][] points4 = { { 9, 0 }, { 0, 2 }, { 3, 1 }, { 10, 8 } };

        assertEquals(2.00000, lta.largestTriangleArea(points1), 0.00001);
        assertEquals(0.50000, lta.largestTriangleArea(points2), 0.00001);
        assertEquals(5.00000, lta.largestTriangleArea(points3), 0.00001);
        assertEquals(37.00000, lta.largestTriangleArea(points4), 0.00001);
    }

    @Test
    public void testMinOperations() {
        MinOperations mo = new MinOperations();

        int[] array1 = { 3, 9, 7 };
        int[] array2 = { 4, 1, 3 };
        int[] array3 = { 3, 2 };

        assertEquals(4, mo.minOperations(array1, 5));
        assertEquals(0, mo.minOperations(array2, 4));
        assertEquals(5, mo.minOperations(array3, 6));
    }

    @Test
    public void testBuildArray() {
        BuildArray ba = new BuildArray();

        int[] array1 = { 0, 2, 1, 5, 3, 4 };
        int[] array2 = { 5, 0, 1, 2, 3, 4 };
        int[] array3 = { 3, 2, 1, 0 };

        assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, ba.buildArray1(array1));
        assertArrayEquals(new int[] { 4, 5, 0, 1, 2, 3 }, ba.buildArray1(array2));
        assertArrayEquals(new int[] { 0, 1, 2, 3 }, ba.buildArray1(array3));

        assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 3 }, ba.buildArray2(array1));
        assertArrayEquals(new int[] { 4, 5, 0, 1, 2, 3 }, ba.buildArray2(array2));
        assertArrayEquals(new int[] { 0, 1, 2, 3 }, ba.buildArray2(array3));
    }

    @Test
    public void testGetConcatenation() {
        GetConcatenation gc = new GetConcatenation();

        int[] array1 = {1,2,1};
        int[] array2 = {1,3,2,1};

        int[] ans1 = {1,2,1,1,2,1};
        int[] ans2 = {1,3,2,1,1,3,2,1};

        assertArrayEquals(ans1, gc.getConcatenation(array1));
        assertArrayEquals(ans2, gc.getConcatenation(array2));
    }

    @Test
    public void testAlternatingSum() {
        AlternatingSum as = new AlternatingSum();

        int[] array1 = {1,3,5,7};
        int[] array2 = {100};

        assertEquals(-4, as.alternatingSum(array1));
        assertEquals(100, as.alternatingSum(array2));
    }

    @Test
    public void testRecoverOrder() {
        RecoverOrder ro = new RecoverOrder();

        int[] order1 = {3,1,2,5,4};
        int[] order2 = {1,4,5,3,2};

        int[] friends1 = {1,3,4};
        int[] friends2 = {2,5};

        int[] ans1 = {3,1,4};
        int[] ans2 = {5,2};

        assertArrayEquals(ans1, ro.recoverOrder(order1, friends1));
        assertArrayEquals(ans2, ro.recoverOrder(order2, friends2));
    }

    @Test
    public void testNumIdenticalPairs() {
        NumIdenticalPairs nip = new NumIdenticalPairs();

        int[] nums1 = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3};

        assertEquals(4, nip.numIdenticalPairs(nums1));
        assertEquals(6, nip.numIdenticalPairs(nums2));
        assertEquals(0, nip.numIdenticalPairs(nums3));
    }

    @Test
    public void testPivotArray() {
        PivotArray pa = new PivotArray();

        int[] nums1 = {9,12,5,10,14,3,10};
        int[] nums2 = {-3,4,3,2};

        int[] ans1 = {9,5,3,10,10,12,14};
        int[] ans2 = {-3,2,4,3};

        assertArrayEquals(ans1, pa.pivotArray(nums1, 10));
        assertArrayEquals(ans2, pa.pivotArray(nums2, 2));
    }
}
