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

    @Test
    public void testPermute() {
        Permute p = new Permute();

        List<List<Integer>> ans1 = Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(1,3,2),
            Arrays.asList(2,1,3),
            Arrays.asList(2,3,1),
            Arrays.asList(3,1,2),
            Arrays.asList(3,2,1)
        );
        List<List<Integer>> ans2 = Arrays.asList(
            Arrays.asList(0,1),
            Arrays.asList(1,0)
        );
        List<List<Integer>> ans3 = Arrays.asList(
            Arrays.asList(1)
        );
        
        assertEquals(ans1, p.permute(new int[] {1,2,3}));
        assertEquals(ans2, p.permute(new int[] {0, 1}));
        assertEquals(ans3, p.permute(new int[] {1}));
    }
}
