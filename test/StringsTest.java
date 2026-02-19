package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;

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

    @Test
    public void testFindRepeatedDnaSequences() {
        FindRepeatedDnaSequences frds = new FindRepeatedDnaSequences();

        assertEquals(Arrays.asList("AAAAACCCCC","CCCCCAAAAA"), frds.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        assertEquals(Arrays.asList("AAAAAAAAAA"), frds.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
        assertEquals(Arrays.asList(), frds.findRepeatedDnaSequences("a"));
    }

    @Test
    public void testFindIndexFirstOccurrenceInString() {
        StrStr strstr = new StrStr();

        String haystack1 = "sadbutsad";
        String haystack2 = "leetcode";
        String haystack3 = "a";
        String haystack4 = "mississippi";

        assertEquals(0, strstr.strStr(haystack1, "sad"));
        assertEquals(-1, strstr.strStr(haystack2, "leeto"));
        assertEquals(0, strstr.strStr(haystack3, "a"));
        assertEquals(-1, strstr.strStr(haystack4, "issipi"));
    }

    @Test
    public void testCountConsistentStrings() {
        CountConsistentStrings ccs = new CountConsistentStrings();

        String allowed1 = "ab";
        String allowed2 = "abc";
        String allowed3 = "cad";

        String[] words1 = {"ad","bd","aaab","baa","badab"};
        String[] words2 = {"a","b","c","ab","ac","bc","abc"};
        String[] words3 = {"cc","acd","b","ba","bac","bad","ac","d"};

        assertEquals(2, ccs.countConsistentStrings(allowed1, words1));
        assertEquals(7, ccs.countConsistentStrings(allowed2, words2));
        assertEquals(4, ccs.countConsistentStrings(allowed3, words3));
    }

    @Test
    public void testScoreOfString() {
        ScoreOfString ss = new ScoreOfString();

        assertEquals(13, ss.scoreOfString("hello"));
        assertEquals(50, ss.scoreOfString("zaz"));
    }

    @Test
    public void testFinalValueAfterOperations() {
        FinalValueAfterOperations fvao = new FinalValueAfterOperations();

        String[] array1 = {"--X","X++","X++"};
        String[] array2 = {"++X","++X","X++"};
        String[] array3 = {"X++","++X","--X","X--"};

        assertEquals(1, fvao.finalValueAfterOperations(array1));
        assertEquals(3, fvao.finalValueAfterOperations(array2));
        assertEquals(0, fvao.finalValueAfterOperations(array3));
    }

    @Test
    public void testMinOperations() {
        MinOperations mo = new MinOperations();

        int[] ans1 = {1,1,3};
        int[] ans2 = {11,8,5,4,3,4};

        assertArrayEquals(ans1, mo.minOperations("110"));
        assertArrayEquals(ans2, mo.minOperations("001011"));
    }

    @Test
    public void testMaxDistinct() {
        MaxDistinct md = new MaxDistinct();

        assertEquals(2, md.maxDistinct("abab"));
        assertEquals(4, md.maxDistinct("abcd"));
        assertEquals(1, md.maxDistinct("aaaa"));
    }
}