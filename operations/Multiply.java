/**
 * 
 */
package operations;

/**
 * @author Grace O'Brien
 *
 */
public class Multiply implements Operations {
	
	/**
	 * This overrides the Operations interface calculate method
	 * and returns the results of multiplying two numbers
	 * @param num1 The number to be multiplied
	 * @param num2 The number to be multiplied by
	 * @return Returns the multiplication of num1 and num2
	 */
	@Override
	public double calculate(double num1,double num2) {
		return num1 * num2;
	}

}
