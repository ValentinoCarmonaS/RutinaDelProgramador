package linked_list.medio;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import helpers.ListNode;

public class RemoveNthFromEnd {

    /**
     * # 19. Remove Nth Node From End of List
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/7639131/19-remove-nth-node-from-end-of-list-by-v-6mpd
     * <p>
     * Given the head of a linked list, remove the nth node from the end of the list
     * and return its head.
     * <p>
     * 
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * 
     * Input: head = [1,2,3,4,5], n = 2
     * <p>
     * Output: [1,2,3,5]
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: head = [1], n = 1
     * <p>
     * Output: []
     * <p>
     * ## Example 3:
     * <p>
     * 
     * Input: head = [1,2], n = 1
     * <p>
     * Output: [1]
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * The number of nodes in the list is sz.
     * <p>
     * 1 <= sz <= 30
     * <p>
     * 0 <= Node.val <= 100
     * <p>
     * 1 <= n <= sz
     * <p>
     * 
     * 
     * _Follow up: Could you do this in one pass?_
     * <p>
     * 
     * @param head the head of a linked list.
     * @param n    nth node from the end.
     * @return remove the nth node from the end of the list
     *         and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(-1, head);
        ListNode prevNode = dummy;
        ListNode currNode = head;

        while (currNode != null && n > 0) {
            currNode = currNode.next;
            n--;
        }

        while (currNode != null) {
            prevNode = prevNode.next;
            currNode = currNode.next;
        }

        prevNode.next = prevNode.next.next;

        return dummy.next;
    }
}
