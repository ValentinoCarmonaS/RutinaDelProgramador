package linked_list.facil;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import helpers.ListNode;

public class HasCycle {

    /**
     * # 141. Linked List Cycle
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/linked-list-cycle/solutions/7639185/141-linked-list-cycle-by-vairoxcs-u8b7
     * <p>
     * Given head, the head of a linked list, determine if the linked list has a
     * cycle in it.
     * <p>
     * 
     * There is a cycle in a linked list if there is some node in the list that can
     * be reached again by continuously following the next pointer. Internally, pos
     * is used to denote the index of the node that tail's next pointer is connected
     * to. Note that pos is not passed as a parameter.
     * <p>
     * 
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * 
     * Input: head = [3,2,0,-4], pos = 1
     * <p>
     * Output: true
     * <p>
     * ### Explanation:
     * <p>
     * There is a cycle in the linked list, where the tail connects to the 1st node
     * (0-indexed).
     * <p>
     * ## Example 2:
     * <p>
     * 
     * 
     * Input: head = [1,2], pos = 0
     * <p>
     * Output: true
     * <p>
     * ### Explanation:
     * <p>
     * There is a cycle in the linked list, where the tail connects
     * to
     * the 0th node.
     * <p>
     * ## Example 3:
     * <p>
     * 
     * 
     * Input: head = [1], pos = -1
     * <p>
     * Output: false
     * <p>
     * ### Explanation:
     * <p>
     * There is no cycle in the linked list.
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * The number of the nodes in the list is in the range [0, 104].
     * <p>
     * -105 <= Node.val <= 105
     * <p>
     * pos is -1 or a valid index in the linked-list.
     * <p>
     * 
     * 
     * _Follow up: Can you solve it using O(1) (i.e. constant) memory?_
     * <p>
     * 
     * 
     * @param head the head of a linked list
     * @return true if there is a cycle in the linked list. Otherwise, return false.
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
