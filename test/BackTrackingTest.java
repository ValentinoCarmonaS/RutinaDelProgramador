package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import backTracking.medio.*;

public class BackTrackingTest {
    
    @Test
    public void testLetterCombinations() {
        LetterCombinations lc = new LetterCombinations();

        List<String> ans1 = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> ans2 = Arrays.asList();
        List<String> ans3 = Arrays.asList("a","b","c");

        assertEquals(ans1, lc.letterCombinations("23"));
        assertEquals(ans2, lc.letterCombinations(""));
        assertEquals(ans3, lc.letterCombinations("2"));
    }
}
