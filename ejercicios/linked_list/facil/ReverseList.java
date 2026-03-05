package linked_list.facil;

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

public class ReverseList {

    /**
     * # 206. Reverse Linked List
     * <P>
     * ### Solved:
     * https://leetcode.com/problems/reverse-linked-list/solutions/7628100/206-reverse-linked-list-by-vairoxcs-z67v
     * <P>
     * Given the head of a singly linked list, reverse the list, and return the
     * <P>
     * reversed list.
     * <P>
     * 
     * 
     * 
     * ## Example 1:
     * <P>
     * 
     * 
     * Input: head = [1,2,3,4,5]
     * <P>
     * Output: [5,4,3,2,1]
     * <P>
     * ## Example 2:
     * <P>
     * 
     * 
     * Input: head = [1,2]
     * <P>
     * Output: [2,1]
     * <P>
     * ## Example 3:
     * <P>
     * 
     * Input: head = []
     * <P>
     * Output: []
     * <P>
     * 
     * 
     * ## Constraints:
     * <P>
     * 
     * The number of nodes in the list is the range [0, 5000].
     * <P>
     * -5000 <= Node.val <= 5000
     * <P>
     * 
     * 
     * Follow up: A linked list can be reversed either iteratively or recursively.
     * <P>
     * Could you implement both?
     * <P>
     * 
     * @param head of a singly linked list
     * @return the head of the reversed list
     */
    public ListNode reverseListIteratively(ListNode head) {

        ListNode tempNode = null;
        ListNode preNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            tempNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = tempNode;
        }

        return preNode;
    }

    public ListNode reverseListRecursively(ListNode head) {

        ListNode tempNode = null;
        ListNode preNode = null;
        ListNode currentNode = head;

        return _reverseListRecursively(tempNode, preNode, currentNode);
    }

    private ListNode _reverseListRecursively(ListNode tempNode, ListNode preNode, ListNode currentNode) {
        if (currentNode == null) return preNode;

        tempNode = currentNode.next;
        currentNode.next = preNode;
        preNode = currentNode;
        currentNode = tempNode;

        return _reverseListRecursively(tempNode, preNode, currentNode);
    }
}
