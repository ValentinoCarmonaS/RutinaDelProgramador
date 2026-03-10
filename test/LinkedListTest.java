package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helpers.ListNode;
import linked_list.facil.*;
import linked_list.medio.RemoveNthFromEnd;

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

    @Test
    public void test01RemoveNthFromEnd() {
        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode newHead = rnfe.removeNthFromEnd(node1, 2);

        assertEquals(node1, newHead);
        ListNode tempNode = newHead.next;

        assertEquals(node2, tempNode);
        tempNode = tempNode.next;

        assertEquals(node3, tempNode);
        tempNode = tempNode.next;

        assertEquals(node5, tempNode);
        tempNode = tempNode.next;
    }

    @Test
    public void test02RemoveNthFromEnd() {
        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();
        ListNode node1 = new ListNode(1);

        ListNode newHead = rnfe.removeNthFromEnd(node1, 1);

        assertEquals(null, newHead);
    }

    @Test
    public void test03RemoveNthFromEnd() {
        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        ListNode newHead = rnfe.removeNthFromEnd(node1, 1);

        assertEquals(node1, newHead);
        ListNode tempNode = newHead.next;

        assertEquals(null, tempNode);
    }

    @Test
    public void test04RemoveNthFromEnd() {
        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();
        ListNode node = new ListNode();

        ListNode newHead = rnfe.removeNthFromEnd(node, 2);

        assertEquals(null, newHead);
    }

    @Test
    public void test05RemoveNthFromEnd() {
        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();

        ListNode newHead = rnfe.removeNthFromEnd(null, 2);

        assertEquals(null, newHead);
    }

    @Test
    public void test01HasCycle() {
        HasCycle hc = new HasCycle();

        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);

        node4.next = node2;

        assertEquals(true, hc.hasCycle(node1));
    }

    @Test
    public void test02HasCycle() {
        HasCycle hc = new HasCycle();

        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        node2.next = node1;

        assertEquals(true, hc.hasCycle(node1));
    }

    @Test
    public void test03HasCycle() {
        HasCycle hc = new HasCycle();

        ListNode node1 = new ListNode(1);

        assertEquals(false, hc.hasCycle(node1));
    }

    @Test
    public void test04HasCycle() {
        HasCycle hc = new HasCycle();

        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);

        assertEquals(false, hc.hasCycle(node1));
    }

    @Test
    public void test05HasCycle() {
        HasCycle hc = new HasCycle();

        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);

        node4.next = node4;

        assertEquals(true, hc.hasCycle(node1));
    }
}
