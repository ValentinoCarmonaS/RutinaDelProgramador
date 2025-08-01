package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import strings.facil.*;

public class StringsTest {
    @Test    
    public void testValidParentheses() {
        ValidParentheses vp = new ValidParentheses();

        assertEquals(false, vp.isValid(")"));
        assertEquals(true, vp.isValid("()"));
        assertEquals(true, vp.isValid("()[]{}"));
        assertEquals(false, vp.isValid("(]"));
        assertEquals(true, vp.isValid("([])"));
        assertEquals(false, vp.isValid("([)]"));
    }

    @Test
    public void testIndexFirstOccurrence() {
        IndexFirstOccurrence idx = new IndexFirstOccurrence();
        
        assertEquals(0, idx.strStr("sadbutsad", "sad"));
        assertEquals(-1, idx.strStr("leetcode", "leeto"));
        assertEquals(3, idx.strStr("salsadbutsad", "sad"));
        assertEquals(-1, idx.strStr("leetcode", "leetcodelock"));
        assertEquals(0, idx.strStr("aaa", "aa"));
        assertEquals(-1, idx.strStr("alamotre", "tree"));
        assertEquals(1, idx.strStr("aab", "ab"));
        assertEquals(4, idx.strStr("mississippi", "issip"));
    }
}
