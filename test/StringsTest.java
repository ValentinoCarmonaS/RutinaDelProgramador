package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import strings.facil.*;
import strings.medio.*;

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

    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWord llw = new LengthOfLastWord();

        assertEquals(5, llw.lengthOfLastWord("Hello World"));
        assertEquals(4, llw.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, llw.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void testAddBinary() {
        AddBinary ab = new AddBinary();

        assertEquals("100", ab.addBinary("11", "1"));
        assertEquals("10101", ab.addBinary("1010", "1011"));
    }

    @Test
    public void testValidPalindrome() {
        ValidPalindrome vp = new ValidPalindrome();

        assertEquals(true, vp.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, vp.isPalindrome("race a car"));
        assertEquals(true, vp.isPalindrome(" %"));
    }

    @Test
    public void testTitleToNumber() {
        TitleToNumber ttn = new TitleToNumber();

        assertEquals(1, ttn.titleToNumber("A"));
        assertEquals(28, ttn.titleToNumber("AB"));
        assertEquals(701, ttn.titleToNumber("ZY"));
        assertEquals(0, ttn.titleToNumber(""));
    }

    @Test
    public void testConvertToTitle() {
        ConvertToTitle ctt = new ConvertToTitle();

        assertEquals("A", ctt.convertToTitle(1));
        assertEquals("AB", ctt.convertToTitle(28));
        assertEquals("ZY", ctt.convertToTitle(701));
        assertEquals("AYS", ctt.convertToTitle(1345));
    }

    @Test
    public void testLengthOfLongestSubstring() {
        LengthOfLongestSubstring lls = new LengthOfLongestSubstring();

        assertEquals(3, lls.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, lls.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, lls.lengthOfLongestSubstring("pwwkew"));
        assertEquals(4, lls.lengthOfLongestSubstring("abcabcbbabcd"));
        assertEquals(7, lls.lengthOfLongestSubstring("Hola Ana, anana me guste"));
        assertEquals(4, lls.lengthOfLongestSubstring("abcabcae"));
        assertEquals(6, lls.lengthOfLongestSubstring("wobgrovw"));
    }

    @Test
    public void testCharacterReplacement() {
        CharacterReplacement cr = new CharacterReplacement();

        assertEquals(4, cr.characterReplacement("AABABBAB", 1));
        assertEquals(4, cr.characterReplacement("AABABBA", 1));
        assertEquals(4, cr.characterReplacement("ABBB", 2));
        assertEquals(1, cr.characterReplacement("A", 0));
        assertEquals(4, cr.characterReplacement("AABABBAB", 1));
    }
}