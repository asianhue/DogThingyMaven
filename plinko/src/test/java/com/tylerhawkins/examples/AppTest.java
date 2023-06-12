package com.tylerhawkins.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
        
    DogObject dog1 = new DogObject("Chihuahua", "Red", "Smol");
    DogObject dog2 = new DogObject("Labradoodle", "Blue", "Medium");
    DogObject dog3 = new DogObject("Golden Retriever", "Gold", "Big");

    public void barkTest(){
        assertEquals("they scream", dog1.getBark());
        assertNotSame("loud", dog2.getBark());
        assertEquals("loudfrfrfr", dog3.getBark());
    }

    public void breedTest(){
        assertEquals("Chihuahua", dog1.getBreed());
        assertEquals("Labradoodle", dog2.getBreed());
        assertNotSame("Labradoogdle", dog3.getBreed());
    }
}
