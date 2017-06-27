package io.zipcode.microlabs.loops;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LoopsTest {

    @Test
    public void printArrayTest(){
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";
        //:when
        String actual =Loops.printArray(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void printLastElementTest(){
    	// :Given
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Mushrooms";
        //:when
        String actual =Loops.printLastElement(breakfast);
        //:Then
        Assert.assertEquals(expected, actual);     		
    }
    
    
    @Test
    public void printLastButOneTest(){
    	// :Given
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" + 
        		"Tomatoes";
        //:when
        String actual =Loops.printLastButOne(breakfast);
        //:Then
        Assert.assertEquals(expected, actual);     		
    }


    @Test
    public void printReverseTest(){
    	// :Given
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
        		"Mushrooms\n" +
        		"Tomatoes\n" +
        		"Bacon\n" +
        		"Beans\n" +
        		"Eggs\n" +
        		"Sausage";
        //:when
        String actual =Loops.printReverse(breakfast);
        //:Then
        Assert.assertEquals(expected, actual);     		
    }

    
    @Test
    public void printPalindromeTest() {
    	// :Given
    	{
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
    	//:when
    	Loops.printPalindrome(breakfast);
        //:Then
        assertFalse(Boolean.FALSE);
    	}
    	
    	{
        String [] palindromic = {"Sausage", "Eggs", "Beans",
        		"Beans", "Eggs", "Sausage"};
        //:when
        Loops.printPalindrome(palindromic);
        //:Then
        assertTrue(Boolean.TRUE);
        }    	
    }
    

    @Test
    public void printCompressTest() {
    		// :Given
			int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
			String expected = "*** Output ***\n" + 
			"1\n" +
			"3\n" + 
			"2\n" + 
			"1\n" + 
			"4";
	        String actual =Loops.printCompress(nums);;
			//:Then
	        Assert.assertEquals(expected, actual);    
		}
    

	@Test
	public void printPack() {
    	// :Given		
    	//String [] letters = {"a", "a", "a", "a", "b", "c", "c", "a", "a", "d","e", "e", "e", "e"};	
		char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
		String expected = "*** Output ***\n" +
		"aaaa, b, cc, aa, d, eeee";
		//:when
	    String actual = Loops.printPack(letters);
	    System.out.println("Actual: " + actual);
	    System.out.println("Expected: " + expected);
		//:Then
	    Assert.assertEquals(expected, actual); 
		} 


}


