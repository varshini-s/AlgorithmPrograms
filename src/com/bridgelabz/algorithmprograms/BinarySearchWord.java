package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;



public class BinarySearchWord 
{


	public static <E extends Comparable<E>> void binarySearch(E[] listOfWords,int firstIndex,int lastIndex,E key )
	{
		int middleIndex = (firstIndex + lastIndex)/2; 

		while( firstIndex <= lastIndex )
		{  
			if ( listOfWords[middleIndex].compareTo(key)<0 )
			{  
				firstIndex = middleIndex + 1;     
			}
			else if ( listOfWords[middleIndex].compareTo(key)==0)
			{  
				System.out.println("given word : "+key+" is found in given list of words ");  
				break;  
			}
			else
			{  
				lastIndex = middleIndex - 1;  
			}  
			middleIndex = (firstIndex + lastIndex)/2;  
		}  
		if ( firstIndex > lastIndex )
		{  
			System.out.println("given word : "+key+" is not found in given list");  
		} 


	}

	public static void main(String[] args) 

	{
		System.out.println("enter the list of words :");
		Scanner scanner = new  Scanner(System.in);
		String string=scanner.nextLine();

		System.out.println("enter the key word to search");
		String key=scanner.next();
		String listOfWords[]=string.toLowerCase().split(",");

		Arrays.sort(listOfWords);

		binarySearch(listOfWords, 0, listOfWords.length-1, key);
		



	}

}
