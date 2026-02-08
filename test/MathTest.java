package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.facil.DifferenceOfSums;
import math.facil.TheMaximumAchievableX;

public class MathTest {
    
    @Test
    public void testTheMaximumAchievableX() {
        assertEquals(6, TheMaximumAchievableX.theMaximumAchievableX(4, 1));
        assertEquals(7, TheMaximumAchievableX.theMaximumAchievableX(3, 2));
    }

    @Test
    public void testDifferenceOfSums() {
        assertEquals(19, DifferenceOfSums.differenceOfSums(10, 3));
        assertEquals(15, DifferenceOfSums.differenceOfSums(5, 6));
        assertEquals(-15, DifferenceOfSums.differenceOfSums(5, 1));
    }
}
