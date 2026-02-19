package array.facil;

public class RecoverOrder {

    /**
     * 3668. Restore Finishing Order
     * <p>
     * Solved
     * <p>
     * You are given an integer array order of length n and an integer array
     * friends.
     * <p>
     * order contains every integer from 1 to n exactly once, representing the IDs
     * of the participants of a race in their finishing order.
     * friends contains the IDs of your friends in the race sorted in strictly
     * increasing order. Each ID in friends is guaranteed to appear in the order
     * array.
     * <p>
     * Return an array containing your friends' IDs in their finishing order.
     * <p>
     * 
     * 
     * 
     * Example 1:
     * <p>
     * 
     * Input: order = [3,1,2,5,4], friends = [1,3,4]
     * <p>
     * 
     * Output: [3,1,4]
     * <p>
     * 
     * Explanation:
     * <p>
     * 
     * The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of
     * your friends is [3, 1, 4].
     * <p>
     * 
     * Example 2:
     * <p>
     * 
     * Input: order = [1,4,5,3,2], friends = [2,5]
     * <p>
     * 
     * Output: [5,2]
     * <p>
     * 
     * Explanation:
     * <p>
     * 
     * The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of
     * your friends is [5, 2].
     * <p>
     * 
     * 
     * 
     * Constraints:
     * <p>
     * 
     * 1 <= n == order.length <= 100
     * <p>
     * order contains every integer from 1 to n exactly once
     * <p>
     * 1 <= friends.length <= min(8, n)
     * <p>
     * 1 <= friends[i] <= n
     * <p>
     * friends is strictly increasing
     * <p>
     * 
     * @param order   contains every integer from 1 to n exactly once,
     *                representing the IDs
     *                of the participants of a race in their finishing order.
     * @param friends contains the IDs of your friends in the race sorted in
     *                strictly
     *                increasing order. Each ID in friends is guaranteed to appear
     *                in the order
     *                array.
     * @return  an array containing your friends' IDs in their finishing
     *         order.
     */
    public int[] recoverOrder(int[] order, int[] friends) {
        if (order == null || friends == null)
            return new int[0];

        boolean[] isFriend = new boolean[101];

        for (int friendId : friends) {
            isFriend[friendId] = true;
        }

        int[] result = new int[friends.length];
        int resultIdx = 0;

        for (int runnerId : order) {
            if (isFriend[runnerId]) {
                result[resultIdx++] = runnerId;
            }
        }

        return result;
    }
}
