/**
 * 
 */
package operations;

/**
 * @author Grace O'Brien
 * 
 */
public class Divide implements Operations {
	/**
	 * This overrides the Operations interface calculate method
	 * and returns the result of a number being divided by another
	 * @param num1 This is the number to be divided
	 * @param num2 This is the number to be divided by
	 * @return Returns the result of num1 being divided by num2
	 */
	@Override
	public double calculate(double num1, double num2) {
		return num1 / num2;
	}
}
