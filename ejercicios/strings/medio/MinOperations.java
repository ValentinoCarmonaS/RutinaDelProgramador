package strings.medio;

public class MinOperations {

    /**
     * 1769. Minimum Number of Operations to Move All Balls to Each Box
     * <p>
     * Solved: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/solutions/7592949/1769-minimum-number-of-operations-to-mov-1mya
     * <p>
     * You have n boxes. You are given a binary string boxes of length n, where
     * boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.
     * <p>
     * 
     * In one operation, you can move one ball from a box to an adjacent box. Box i
     * is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may
     * be more than one ball in some boxes.
     * <p>
     * 
     * Return an array answer of size n, where answer[i] is the minimum number of
     * operations needed to move all the balls to the ith box.
     * <p>
     * 
     * Each answer[i] is calculated considering the initial state of the boxes.
     * <p>
     * 
     * 
     * 
     * Example 1:
     * <p>
     * 
     * Input: boxes = "110"
     * <p>
     * Output: [1,1,3]
     * <p>
     * Explanation: The answer for each box is as follows:
     * <p>
     * 1) First box: you will have to move one ball from the second box to the first
     * box in one operation.
     * <p>
     * 2) Second box: you will have to move one ball from the first box to the
     * second box in one operation.
     * <p>
     * 3) Third box: you will have to move one ball from the first box to the third
     * box in two operations, and move one ball from the second box to the third box
     * in one operation.
     * <p>
     * Example 2:
     * <p>
     * 
     * Input: boxes = "001011"
     * <p>
     * Output: [11,8,5,4,3,4]
     * <p>
     * 
     * 
     * Constraints:
     * <p>
     * 
     * n == boxes.length
     * <p>
     * 1 <= n <= 2000
     * <p>
     * boxes[i] is either '0' or '1'.
     * <p>
     * 
     * @param boxes Binary string boxes of length n, where
     *              boxes[i] is '0' if the ith box is empty, and '1' if it contains
     *              one ball.
     * @return Array answer of size n, where answer[i] is the minimum number of
     *         operations needed to move all the balls to the ith box
     */
    public int[] minOperations(String boxes) {
        
        final int n = boxes.length();
        final char[] boxArray = boxes.toCharArray();
        final int[] answer = new int[n];

        int count = 0;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            answer[i] += ops;

            if (boxArray[i] == '1') {
                count++;
            }
            ops += count;
        }

        count = 0;
        ops = 0;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] += ops;

            if (boxArray[i] == '1') {
                count++;
            }
            ops += count;
        }

        return answer;
    }
}
