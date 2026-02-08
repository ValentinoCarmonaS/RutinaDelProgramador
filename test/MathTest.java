package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.facil.TheMaximumAchievableX;

public class MathTest {
    
    @Test
    public void testTheMaximumAchievableX() {
        assertEquals(6, TheMaximumAchievableX.theMaximumAchievableX(4, 1));
        assertEquals(7, TheMaximumAchievableX.theMaximumAchievableX(3, 2));
    }
}
