package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each

		// Convert the String to character array
		char[] charArray = test.toCharArray();
		
		// Traverse through each character (using loop)
		for(int i=0; i<charArray.length; i++)
		{
		
		// Find if the given character is what type using (if)
			
		//// i) Character.isLetter
			if(Character.isLetter(charArray[i]))
			{
				letter++;
			}
		// ii) Character.isDigit
			else if(Character.isDigit(charArray[i]))
			{
				num++;
			}
		// iii)Character.isSpaceChar
			else if(Character.isSpaceChar(charArray[i]))
			{
				space++;
			}
		// iv) else -> consider as special character
			else
			{
				specialChar++;
			}
			
		}

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
