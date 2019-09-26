/**
 * 
 */
package operations;

/**
 * 
 * @author Grace O'Brien
 *
 */
public class Add implements Operations {
	/**
	 * Overrides the Operations interface calculate method
	 * and returns the result of adding num1 and num2
	 * @param num1 This is the number being added to
	 * @param num2 This is the number being added
	 * @return Returns the results of num2 being added to num1
	 */
	@Override
	public double calculate(double num1, double num2) {
		return num1 + num2;
	}

}