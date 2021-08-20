package week1.day2;

public class Calculator {

	/*
	 * -- Create a class "Calculator" with below methods (a) add(int num1, int num2,
	 * int num3), it should return sum of num1+num2+num3 (b) sub(int num1, int
	 * num2), it should return subtraction of of num1-num2 (c) mul(double num1,
	 * double num2), it should return product of num1 * num2 (d) divide(float num1,
	 * float num2), it should return division of num1 / num2
	 * 
	 * -- Create another class as MyCalculator and call all the methods from
	 * Calculator and print the results
	 */ int num1 = 10;
	int num2 = 5;
	int num3 = 15;

	public int add()
	{
		int sum = (num1+num2+num3);
		return sum;
	}
	public int sub()
	{
		int sub = (num1-num2);
		return sub;
	}
	public double mul()
	{
		double mul = (num1*num2);
		return mul;
	}
	public float div()
	{
		float div = (num1/num2);
		return div;
	}

}
