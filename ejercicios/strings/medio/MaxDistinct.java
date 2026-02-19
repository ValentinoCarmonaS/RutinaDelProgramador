package strings.medio;

public class MaxDistinct {
    
    /**
     * # 3760. Maximum Substrings With Distinct Start
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/maximum-substrings-with-distinct-start/solutions/7592973/3760-maximum-substrings-with-distinct-st-qslr
     * <p>
     * You are given a string s consisting of lowercase English letters.
     * <p>
     * 
     * Return an integer denoting the maximum number of substrings you can split s
     * into such that each substring starts with a distinct character (i.e., no two
     * substrings start with the same character).
     * <p>
     * 
     * 
     * 
     * ### Example 1:
     * <p>
     * 
     * - Input: s = "abab"
     * <p>
     * 
     * - Output: 2
     * <p>
     * 
     * #### Explanation:
     * <p>
     * 
     * - Split "abab" into "a" and "bab".
     * <p>
     * - Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the
     * answer is 2.
     * <p>
     * ### Example 2:
     * <p>
     * 
     * - Input: s = "abcd"
     * <p>
     * 
     * - Output: 4
     * <p>
     * 
     * #### Explanation:
     * <p>
     * 
     * - Split "abcd" into "a", "b", "c", and "d".
     * <p>
     * - Each substring starts with a distinct character. Thus, the answer is 4.
     * <p>
     * ### Example 3:
     * <p>
     * 
     * - Input: s = "aaaa"
     * <p>
     * 
     * - Output: 1
     * <p>
     * 
     * #### Explanation:
     * <p>
     * 
     * - All characters in "aaaa" are 'a'.
     * <p>
     * - Only one substring can start with 'a'. Thus, the answer is 1.
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * - 1 <= s.length <= 105
     * <p>
     * - s consists of lowercase English letters.
     * <p>
     * 
     * @param s String consisting of lowercase English letters
     * @return The maximum number of substrings you can split s
     *         into such that each substring starts with a distinct character (i.e.,
     *         no two
     *         substrings start with the same character).
     */
    public int maxDistinct(String s) {
        if (s.length() < 1 || s.length() > 100000) {
            throw new IllegalArgumentException("El String s debe estar entre 1 y 100.000");
        }

        final boolean[] alphabet = new boolean[26];
        int newSubstrings = 0;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (!alphabet[idx]) {
                newSubstrings++;
                alphabet[idx] = true;
            }
        }

        return newSubstrings;
    }
}
