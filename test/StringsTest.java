package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import strings.facil.*;

public class StringsTest {
    @Test    
    public void testValidParentheses() {
        ValidParentheses vp = new ValidParentheses();

        assertEquals(false, vp.isValid(")"));
        assertEquals(true, vp.isValid("()"));
        assertEquals(true, vp.isValid("()[]{}"));
        assertEquals(false, vp.isValid("(]"));
        assertEquals(true, vp.isValid("([])"));
        assertEquals(false, vp.isValid("([)]"));
    }
}
