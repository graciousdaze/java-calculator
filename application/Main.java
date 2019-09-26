/**
 * 
 */
package application;
import java.util.Scanner;

/**
 * @author Grace O'Brien
 *
 */
public class Main {
	
	public static boolean isRunning = true;
	/**
	 * @param args Unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		Scanner in = new Scanner(System.in);
		double num1, num2, result;
		String input;
		
		System.out.println("Enter a number...");
		num1 = in.nextDouble();
		
		while(isRunning) {
			System.out.println("Enter another number...");
			num2 = in.nextDouble();
			
			System.out.println("Enter an operation: +, -, *, or / ");
			input = in.next();
			
			result = calc.calculate(input, num1, num2);
			System.out.println("The result of " + num1 + " " + input + " " + num2 + " equals " + result);
			
			System.out.println("Enter another number or enter (e) to exit:");
			input = in.next();
			
			if(input.contentEquals("e")) {
				isRunning = false;
				in.close();
			} else {
				num1 = Double.parseDouble(input);
			}
		}
	}

}
