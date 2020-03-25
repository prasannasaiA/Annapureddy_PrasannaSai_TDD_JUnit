package com.epam;


import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest{
	
	@Test
	public void checkTestCases() {
		
		String finalString;
		
		finalString=App.removeCharA("AB");
		assertEquals("B",finalString);
		
		finalString=App.removeCharA("AA");
		assertEquals("",finalString);
		
		finalString=App.removeCharA("CD");
		assertEquals("CD",finalString);
		
		finalString=App.removeCharA("AABBCC");
		assertEquals("BBCC",finalString);
		
		finalString=App.removeCharA("BBCCDD");
		assertEquals("BBCCDD",finalString);
		
		finalString=App.removeCharA("BBCCAA");
		assertEquals("BBCCAA",finalString);
		
		finalString=App.removeCharA("BBAACC");
		assertEquals("BBAACC",finalString);
		
		
	}
	
	
}