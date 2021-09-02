package com.bridgelabz.algorithmprograms;

import java.util.*;

public class StringPermutation 


{
	static String  stringArrayFromRecursion[];
	static String  stringArrayFromIteration[];
	static int arrayIndex=0;
	
	private static void swap(char[] characterArray, int firstCharacterIndex, int secondCharacterIndex)
	{
		char temp = characterArray[firstCharacterIndex];
		characterArray[firstCharacterIndex] = characterArray[secondCharacterIndex];
		characterArray[secondCharacterIndex] = temp;
	}


	

	private static void permutations(char[] characterArray, int currentIndex)
	{
		
		 
		
		if (currentIndex == characterArray.length - 1) 
		{
			stringArrayFromRecursion[arrayIndex]=String.valueOf(characterArray);
			arrayIndex++;
			//System.out.println(String.valueOf(characterArray));
		}

		for (int index = currentIndex; index < characterArray.length; index++)
		{
			swap(characterArray, currentIndex, index);
			permutations(characterArray, currentIndex + 1);
			swap(characterArray, currentIndex, index);
		}
	}


	public static void generatePermutationsRecursiveMethod(String string)
	{

		if (string == null || string.length() == 0) 
		{
			return;
		}

		//to get number of permutations
		int stringLength=string.length();
		int arraySize=1;
		for( arraySize = 1; stringLength > 1; stringLength--)
		{
	         arraySize *= stringLength;
	      
		}
		
		 stringArrayFromRecursion = new String[arraySize];
		permutations(string.toCharArray(), 0);
	}


	 

	
	 public static boolean checkTwoArrayEquality(String stringArrayFromRecursion[], String stringArrayFromIteration[]) 
	 { 
	   
	     if (stringArrayFromRecursion.length != stringArrayFromIteration.length) 
	         return false;
	   
	     Arrays.sort(stringArrayFromRecursion);
	     Arrays.sort(stringArrayFromIteration);
	   
	     for (int index = 0 ; index < stringArrayFromRecursion.length;index++) 
	         if (stringArrayFromRecursion[index] != stringArrayFromIteration[index]) 
	             return false;
	   
	     return true;
	 }
	


	public static void main(String[] args) 

	{
		String string ="ABCd";
		generatePermutationsRecursiveMethod(string);
		
	}

}
