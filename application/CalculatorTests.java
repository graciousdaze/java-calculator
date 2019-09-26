/**
 * 
 */
package application;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Grace O'Brien
 *
 */
public class CalculatorTests {

	Calculator calc = new Calculator();
	
	@Test
	public void testCalculator() {
		assertEquals(7.5, calc.calculate("+", 3.5, 4), 0.0001);
		assertEquals(0.899, calc.calculate("+", 0.999, -0.1), 0.0001);
		
		assertEquals(8.9, calc.calculate("-", 9, 0.1), 0.0001);
		assertEquals(-5.23, calc.calculate("-", -6, -0.77), 0.0001);
		
		assertEquals(-0.85, calc.calculate("*", -17, 0.05), 0.0001);
		assertEquals(546, calc.calculate("*", 13, 42), 0.0001);
		
		assertEquals(-16, calc.calculate("/", 72, -4.5), 0.0001);
		assertEquals(0.14, calc.calculate("/", 0.007, 0.05), 0.0001);
	}
}
