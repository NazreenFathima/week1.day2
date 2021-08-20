package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String
		String text1 = "stops";
		
		// Declare another String
		String text2 = "potss";
		
		// Check length of the strings are same then (Use A Condition)
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1==length2)
		{
			// Convert both Strings in to characters
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			// Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			// Check both the arrays has same value
			if(Arrays.equals(charArray1, charArray2))
			{
				System.out.println("Given string is anagram");
			}
			else
			{
				System.out.println("Given string is not anagram");
			}
			
		}
		
	}

}
