/**
 * 
 */
package application;

import java.util.HashMap;
import operations.*;

/**
 * @author Grace O'Brien
 *
 */
public class Calculator {
	private HashMap<String,Operations> calculations = new HashMap<String, Operations>();
	
	public Calculator() {
		calculations.put("+", new Add());
		calculations.put("-", new Subtract());
		calculations.put("*", new Multiply());
		calculations.put("/", new Divide());
	}
	
	public double calculate(String operator, double num1, double num2) {
		Operations operate = calculations.get(operator);
		return operate.calculate(num1, num2);
	}
	
}
