package strings.medio;

public class LongestPalindrome {

    /**
     * # 5. Longest Palindromic Substring
     * <p>
     * Solved:
     * https://leetcode.com/problems/longest-palindromic-substring/solutions/7628045/5-longest-palindromic-substring-by-vairo-kg2w
     * <p>
     * Given a string s, return the longest palindromic substring in s.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * Input: s = "babad"
     * <p>
     * Output: "bab"
     * <p>
     * ### Explanation:
     * <p>
     * "aba" is also a valid answer.
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: s = "cbbd"
     * <p>
     * Output: "bb"
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * 1 <= s.length <= 1000
     * <p>
     * s consist of only digits and English letters.
     * <p>
     * 
     * @param s string
     * @return the longest palindromic substring in s
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        final char[] chars = s.toCharArray();
        final int n = chars.length;

        int maxStart = 0;
        int maxLength = 1;

        for (int i = 0; i < n;) {

            if (n - i <= maxLength / 2) {
                break;
            }

            int left = i;
            int right = i;

            while (right < n - 1 && chars[right] == chars[right + 1]) {
                right++;
            }

            i = right + 1;

            while (left > 0 && right < n - 1 && chars[left - 1] == chars[right + 1]) {
                left--;
                right++;
            }

            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxStart = left;
                maxLength = currentLength;
            }
        }

        return new String(chars, maxStart, maxLength);
    }
}
