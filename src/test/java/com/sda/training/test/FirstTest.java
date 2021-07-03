package com.sda.training.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

    @Before
    public void setUp() {
        System.out.println("INSIDE SETUP !!!");

    }

    @After
    public void tearDown() {
        System.out.println("INSIDE TEARDOWN !!!");

    }

    @Test
    public void testFirst() {
        System.out.println("WE ARE INSIDE FIRST TEST METHOD");

    }

    @Test
    public void testSecond() {
        System.out.println("WE ARE INSIDE SECOND TEST METHOD");
    }
}
