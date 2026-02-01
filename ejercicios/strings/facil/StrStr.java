package strings.facil;

public class StrStr {

    /**
     * 28. Find the Index of the First Occurrence in a String
     * Solved
     * premium lock icon
     * Companies
     * Given two strings needle and haystack, return the index of the first
     * occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * Example 2:
     * 
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     * 
     * 
     * Constraints:
     * 
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters.
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || haystack == null)
            return -1;

        int n = haystack.length();
        int m = needle.length();

        if (m > n)
            return -1;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }

            if (checkMatch(haystack, needle, i, m)) {
                return i;
            }
        }

        return -1;
    }

    private boolean checkMatch(String haystack, String needle, int start, int m) {
        for (int j = 1; j < m; j++) {
            if (haystack.charAt(start + j) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}