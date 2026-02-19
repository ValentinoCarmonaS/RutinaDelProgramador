package strings.medio;

public class MinPartitions {
    
    /**
     * # 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/solutions/7592982/1689-partitioning-into-minimum-number-of-5h7k
     * <p>
     * A decimal number is called deci-binary if each of its digits is either 0 or 1
     * without any leading zeros. For example, 101 and 1100 are deci-binary, while
     * 112 and 3001 are not.
     * <p>
     * 
     * Given a string n that represents a positive decimal integer, return the
     * minimum number of positive deci-binary numbers needed so that they sum up to
     * n.
     * <p>
     * 
     * ### Example 1:
     * <p>
     * 
     * - Input: n = "32"
     * <p>
     * - Output: 3
     * <p>
     * #### Explanation:
     * <p>
     * - 10 + 11 + 11 = 32
     * <p>
     * ### Example 2:
     * <p>
     * - Input: n = "82734"
     * <p>
     * - Output: 8
     * <p>
     * ### Example 3:
     * <p>
     * 
     * - Input: n = "27346209830709182346"
     * <p>
     * - Output: 9
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * - 1 <= n.length <= 105
     * <p>
     * - n consists of only digits.
     * <p>
     * - n does not contain any leading zeros and represents a positive integer.
     * <p>
     * 
     * @param n String that represents a positive decimal integer
     * @return The minimum number of positive deci-binary numbers needed so that they sum up to n.
     */
    public int minPartitions(String n) {
        final int len = n.length();

        if (len < 1 || len > 100000) {
            throw new IllegalArgumentException("El string n debe ser de longitud valida");
        }

        int maxDigit = 0;

        for (int i = 0; i < len; i++) {
            int currentDigit = n.charAt(i) - '0';

            if (currentDigit == 9) {
                return currentDigit;
            }

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
        }

        return maxDigit;
    }
}
