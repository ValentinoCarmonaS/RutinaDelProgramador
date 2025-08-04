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
}
