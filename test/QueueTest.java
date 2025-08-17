package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import Queue.facil.MyStack;
import Queue.medio.FindKthLargest;
import helpers.testHelpers.helpers.ArrayFromFile;

public class QueueTest {
    
    @Test
    public void testMyStack() {
        MyStack stack = new MyStack();
        stack.push(1);
        assertEquals(false, stack.empty());
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(false, stack.empty());
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertEquals(false, stack.empty());
        
        stack = new MyStack();
        stack.push(1);
        assertEquals(false, stack.empty());
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(false, stack.empty());
        assertEquals(2, stack.top());
        stack.push(3);
        assertEquals(false, stack.empty());
        assertEquals(3, stack.top());

        assertEquals(3, stack.pop());
        assertEquals(false, stack.empty());

        stack.push(4);
        assertEquals(false, stack.empty());
        assertEquals(4, stack.top());

        assertEquals(4, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(2, stack.pop());
        assertEquals(false, stack.empty());
        assertEquals(1, stack.pop());
        assertEquals(true, stack.empty());
    }

    @Test
    public void testFindKthLargest() {
        FindKthLargest fkl = new FindKthLargest();

        assertEquals(5, fkl.findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        assertEquals(4, fkl.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));

        try {
            int[] test3 = ArrayFromFile.arrayFromFile("ejercicios\\helpers\\testHelpers\\txt\\testFindKthLargest.txt");
            assertEquals(1, fkl.findKthLargest(test3, 50000));
        } catch (IOException e) {
            fail("No se cargo el test3 testFindKthLargest.txt y ocurrio el error: " + e);
        }
    }
}
