package search.facil;

public class ArrangeCoins {

    /**
     * 441. Arranging Coins
     * Solved
     * You have n coins and you want to build a staircase with these coins. The
     * staircase consists of k rows where the ith row has exactly i coins. The last
     * row of the staircase may be incomplete.
     * 
     * Given the integer n, return the number of complete rows of the staircase you
     * will build.
     * 
     * Example 1:
     * 
     * Input: n = 5
     * Output: 2
     * Explanation: Because the 3rd row is incomplete, we return 2.
     * Example 2:
     * 
     * Input: n = 8
     * Output: 3
     * Explanation: Because the 4th row is incomplete, we return 3.
     * 
     * Constraints:
     * 
     * 1 <= n <= 2^31 - 1
     * 
     * @param n
     * @return number of rows
     */
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        int ans = 0;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            long numOfCoins = (long) mid * (mid + 1) / 2;

            if (numOfCoins <= n) {
                ans = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}