package com.week1.day5.assignment1;

import java.util.Arrays;

public class MethodsAndFlow {

	String[] stringArray;

	public MethodsAndFlow(String[] stringArray) {

		this.stringArray = stringArray;

	}

	public void outputSubset(int startPosition, int numberOfValues) {
//		Integer number = 0;

		if (startPosition < 0 | startPosition > stringArray.length)
			startPosition = 0;
		
		if (startPosition + numberOfValues > stringArray.length)
			numberOfValues = stringArray.length - startPosition;
		
		for (int i = startPosition; i <= (startPosition + numberOfValues - 1); i++) {
			System.out.println(stringArray[i]);
		}
		
	}

	public void outputAll() 
	{
		outputSubset(0, stringArray.length);
		
	}

}
