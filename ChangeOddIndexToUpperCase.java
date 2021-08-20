package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare String Input as Follow
		// String test = "changeme";
		String test = "changeme";

		// Convert the String to character array
		char[] charArray = test.toCharArray();
		
		// Traverse through each character (using loop)
		for (int i=0; i<charArray.length; i++)
		{
		// find the odd index within the loop (use mod operator)
			if(i%2 == 0)
			{
				// within the loop, change the character to uppercase, if the index is odd else don't change
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		System.out.println(charArray);
	}

}

