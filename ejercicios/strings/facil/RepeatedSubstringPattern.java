package strings.facil;

public class RepeatedSubstringPattern {

    /**
     * # 459. Repeated Substring Pattern
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/repeated-substring-pattern/solutions/7628197/459-repeated-substring-pattern-by-vairox-z1kq
     * <p>
     * Given a string s, check if it can be constructed by taking a substring of it
     * and appending multiple copies of the substring together.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * Input: s = "abab"
     * <p>
     * Output: true
     * <p>
     * ### Explanation:
     * <p>
     * It is the substring "ab" twice.
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: s = "aba"
     * <p>
     * Output: false
     * <p>
     * ## Example 3:
     * <p>
     * 
     * Input: s = "abcabcabcabc"
     * <p>
     * Output: true
     * <p>
     * ### Explanation:
     * <p>
     * It is the substring "abc" four times or the substring "abcabc"
     * twice.
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * 1 <= s.length <= 104
     * <p>
     * s consists of lowercase English letters.
     * <p>
     * 
     * @param s String
     * @return Checks if the String can be constructed by taking a substring of it
     *         and appending multiple copies of the substring together.
     */
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder builder = new StringBuilder();

                int numRepeats = n / i;

                for (int j = 0; j < numRepeats; j++) {
                    builder.append(substring);
                }

                if (builder.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
