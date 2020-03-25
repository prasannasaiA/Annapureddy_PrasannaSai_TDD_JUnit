package com.epam;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	static final Logger LOGGER=LogManager.getLogger(App.class);
	
	static Scanner input=new Scanner(System.in);
	
	static String removeCharA(String inputString) {
		
		if(inputString.length()<=2) {
    		
    		if(inputString.contains("A")) {
    			
    			inputString=inputString.replace("A", "");
    		}
    		
    	}
    	
    	else {
    		
    		String firstSubStr=inputString.substring(0, 2);
    		String secondSubStr=inputString.substring(2);
    		
    		if(firstSubStr.contains("A")) {
    			firstSubStr=firstSubStr.replace("A", "");
    		}
    		
    		inputString=firstSubStr+secondSubStr;
    		
    	}
		return inputString;
	}
	
    public static void main( String[] args )
    {
    	String inputString,finalString;
    	
    	LOGGER.info("Enter a string:");
    	inputString = input.next();
    	
    	finalString = App.removeCharA(inputString);
    	
    	LOGGER.info("The Final string after removing character \"A\" from first 2 characters of given input string is: ");
    	LOGGER.info("\""+finalString+"\"");
        
    }
}
