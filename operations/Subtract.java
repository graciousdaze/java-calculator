/**
 * 
 */
package operations;

/**
 * @author Grace O'Brien
 *
 */
public class Subtract implements Operations{
	
	/**
	 * Overrides the Operations interface calculate method and returns
	 * the result of subtracting num2 from num1
	 * @param num1 The number being subtracted from
	 * @param num2 The number to be subtracted
	 * @return Returns the result of subtracting num2 from num1
	 */
	@Override
	public double calculate(double num1, double num2) {
		System.out.println("Getting there...");
		return num1 - num2;
	}
}
