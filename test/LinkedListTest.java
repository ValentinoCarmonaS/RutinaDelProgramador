package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helpers.ListNode;
import linked_list.facil.*;

public class LinkedListTest {
    
    @Test
    public void testMergeTwoSortedLists() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode listA_3 = new ListNode(4);
        ListNode listA_2 = new ListNode(2, listA_3);
        ListNode listA_1 = new ListNode(1, listA_2); 
          
        ListNode listB_3 = new ListNode(4);
        ListNode listB_2 = new ListNode(3, listB_3);
        ListNode listB_1 = new ListNode(1, listB_2); 

        ListNode ans = mtsl.mergeTwoLists(listA_1, listB_1); 
        assertEquals(listB_1.val, ans.val);
        ans = ans.next;
        assertEquals(listA_1.val, ans.val);
        ans = ans.next;
        assertEquals(listA_2.val, ans.val);
        ans = ans.next;
        assertEquals(listB_2.val, ans.val);
        ans = ans.next;
        assertEquals(listB_3.val, ans.val);
        ans = ans.next;
        assertEquals(listA_3.val, ans.val);
        ans = ans.next;
        assertEquals(null, ans);
    }

    @Test
    public void Test01ReverseListIteratively() {
        ReverseList rl = new ReverseList();

        ListNode node_5 = new ListNode(5);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        ListNode head = rl.reverseListIteratively(node_1);
        assertEquals(head.val, node_5.val);
        ListNode node = head.next;
        assertEquals(node.val, node_4.val);
        node = node.next;
        assertEquals(node.val, node_3.val);
        node = node.next;
        assertEquals(node.val, node_2.val);
        node = node.next;
        assertEquals(node.val, node_1.val);
        node = node.next;
        assertEquals(null, node);
    }

    @Test
    public void Test02ReverseListIteratively() {
        ReverseList rl = new ReverseList();

        ListNode node_2 = new ListNode(2);
        ListNode node_1 = new ListNode(1, node_2);

        ListNode head = rl.reverseListIteratively(node_1);
        assertEquals(head.val, node_2.val);
        ListNode node = head.next;
        assertEquals(node.val, node_1.val);
        node = node.next;
        assertEquals(null, node);
    }

    @Test
    public void Test03ReverseListIteratively() {
        ReverseList rl = new ReverseList();

        ListNode node_1 = new ListNode();

        ListNode head = rl.reverseListIteratively(node_1);
        assertEquals(head.val, node_1.val);
        ListNode node = head.next;
        assertEquals(null, node);
    }

    @Test
    public void Test04ReverseListIteratively() {
        ReverseList rl = new ReverseList();

        ListNode head = rl.reverseListIteratively(null);
        assertEquals(null, head);
    }

    @Test
    public void Test01ReverseListRecursively() {
        ReverseList rl = new ReverseList();

        ListNode node_5 = new ListNode(5);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        ListNode head = rl.reverseListRecursively(node_1);
        assertEquals(head.val, node_5.val);
        ListNode node = head.next;
        assertEquals(node.val, node_4.val);
        node = node.next;
        assertEquals(node.val, node_3.val);
        node = node.next;
        assertEquals(node.val, node_2.val);
        node = node.next;
        assertEquals(node.val, node_1.val);
        node = node.next;
        assertEquals(null, node);
    }

    @Test
    public void Test02ReverseListRecursively() {
        ReverseList rl = new ReverseList();

        ListNode node_2 = new ListNode(2);
        ListNode node_1 = new ListNode(1, node_2);

        ListNode head = rl.reverseListRecursively(node_1);
        assertEquals(head.val, node_2.val);
        ListNode node = head.next;
        assertEquals(node.val, node_1.val);
        node = node.next;
        assertEquals(null, node);
    }

    @Test
    public void Test03ReverseListRecursively() {
        ReverseList rl = new ReverseList();

        ListNode node_1 = new ListNode();

        ListNode head = rl.reverseListRecursively(node_1);
        assertEquals(head.val, node_1.val);
        ListNode node = head.next;
        assertEquals(null, node);
    }

    @Test
    public void Test04ReverseListRecursively() {
        ReverseList rl = new ReverseList();

        ListNode head = rl.reverseListRecursively(null);
        assertEquals(null, head);
    }
}
