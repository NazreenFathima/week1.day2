package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		int add = calc.add();
		System.out.println("Sum of numbers is : " +add);
		int sub = calc.sub();
		System.out.println("Sub of numbers is : " +sub);
		double mul = calc.mul();
		System.out.println("Mul of numbers is : " +mul);
		float div = calc.div();
		System.out.println("Div of numbers is : " +div);

	}

}
