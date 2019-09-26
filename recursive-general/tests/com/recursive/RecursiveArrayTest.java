package com.recursive;

import org.junit.jupiter.api.Test;

import static com.recursive.RecursiveArray.recursiveMax;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveArrayTest {

    @Test
    void recursiveMaxTest() {
        int[] intArray1 = new int[10];
        assertEquals(6, recursiveMax(intArray1));

        int[] intArray2 = new int[10];
        assertEquals(8, intArray1);
    }

    @Test
    void recursiveMinTest() {
    }

    @Test
    void recursiveSum() {
    }

    @Test
    void recursiveMultiply() {
    }

    @Test
    void recursiveAverage() {
    }
}