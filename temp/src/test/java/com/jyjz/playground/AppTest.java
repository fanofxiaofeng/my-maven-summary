package com.jyjz.playground;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    @Override
    public void setUp() {
        System.out.println("setUp() in AppTest");
    }

    public void testApp() {
    }

    public void test1() {

    }
}
