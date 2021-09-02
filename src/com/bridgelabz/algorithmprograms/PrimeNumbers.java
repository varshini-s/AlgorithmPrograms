package com.bridgelabz.algorithmprograms;

import java.util.LinkedList;

public class PrimeNumbers
{
	
	public static LinkedList<Integer> findPrimeNumbers(int lowerBound,int upperBound) 
	{
		boolean isPrime=true;
		LinkedList<Integer> listOfPrime=new LinkedList<Integer>();  

		
		for(int index1=lowerBound;index1<=upperBound;index1++)
		{
			
			if(index1==1 || index1==0)
				continue;
			
			for(int index2=2;index2<=index1/2;index2++)
			{
				if(index1%index2==0)
				{
					isPrime=false;
					break;
				}
					
					
			}
			if(isPrime==true)
			{
				listOfPrime.add(index1);
				
			}
			isPrime=true;
		}
		
		return listOfPrime;
	}

	public static void main(String[] args) 
	
	{
		

		

	}

}
