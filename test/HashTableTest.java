package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hash_table.facil.*;

public class HashTableTest {
    @Test
    public void testRomanToInt() {
        RomanToInt hash = new RomanToInt();
        int test1 = hash.romanToInt("III");
        int test2 = hash.romanToInt("LVIII");
        int test3 = hash.romanToInt("MCMXCIV");

        assertEquals(3, test1);
        assertEquals(58, test2);
        assertEquals(1994, test3);
    }
} 
