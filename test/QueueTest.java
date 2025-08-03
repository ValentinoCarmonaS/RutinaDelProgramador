package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Queue.facil.MyStack;

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
}
