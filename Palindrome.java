package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a) Declare A String value as"madam"
		String str = "madam";
		
		//b) Declare another String rev value as ""
		String rev = "";
		
		//c) Iterate over the String in reverse order
		for (int i = str.length()-1; i>=0; i--)
		{ 
			//d) Add the char into rev
			rev=rev+str.charAt(i);	
		}
		
		//Compare the original String with the reversed String, if it is same then print palinDrom
		if(str.equals(rev))
		{
			System.out.println("Given string is palindrom");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
