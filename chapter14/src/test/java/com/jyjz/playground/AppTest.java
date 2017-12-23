package com.jyjz.playground;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigInteger;
import java.util.Collections;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public final int hour;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        hour = 12;
        Collections.emptyList();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Boolean a = new Boolean("trUe");
        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(hour);
        assertTrue( true );
    }
}
