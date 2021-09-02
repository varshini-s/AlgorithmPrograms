package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class GuessNumber 
{
	public static void guessNumber(int startRange, int endRange)
	{
		Scanner scanner = new Scanner(System.in);
		
		boolean isNumber;
		
		
		int mid=(startRange+endRange)/2;
		
		System.out.println("Is the number : "+mid+"?");
		
		isNumber=scanner.nextBoolean();
		
		if(isNumber==true)
		{
			System.out.println("Successfully guessed the number");
			
		}
		
		else if(isNumber==false)
		{
			System.out.println("Is the number in the range :"+(mid+1)+" "+endRange);
			boolean isRange=scanner.nextBoolean();
			
			if(isRange==true)
			{
				guessNumber(mid+1, endRange);
			}
			else if(isRange==false)
			{
				guessNumber(startRange, mid-1);
			}
			else
			{
				System.out.println("invalid input");
				guessNumber(startRange, endRange);
			}
			
			
		}
		else
		{
			System.out.println("invalid input");
			guessNumber(startRange, endRange);
			
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		System.out.println("enter the lower and upper limit to guess the number");
		Scanner scanner = new Scanner(System.in);
		int lowerBound=scanner.nextInt();
		int upperBound=scanner.nextInt();
		
		guessNumber(lowerBound,upperBound);
		
	}

}
