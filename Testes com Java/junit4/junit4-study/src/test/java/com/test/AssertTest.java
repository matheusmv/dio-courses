package com.test;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {

        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("test", "test");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    public void testAssertNotNull() {

        var object = new Object();

        assertNotNull(object);
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertNotSame() {

        var expectedObject = new Object();
        var actualObject = new Object();

        assertNotSame(expectedObject, actualObject);
    }

    @Test
    public void testAssertSame() {

        var number = Integer.valueOf(768);

        assertSame(number, number);
    }
}
