import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.calculator.Calculator;

class calcTest {

	@Test
	public void sumtest() {
		assertEquals("Sum Result",3,Calculator.sum(1, 2));
		assertEquals("Sum with Negative Nos.",-3,Calculator.sum(-1, -2));
		assertEquals("Sum with zero",9,Calculator.sum(9, 0));
	}
	
	@Test
	public void subtest() {
		
		assertEquals("Subtraction result as negative",-1,Calculator.subtract(1, 2));
		assertEquals("Subtraction with 2 negatives nos.",1,Calculator.subtract(-1, -2));
		assertEquals("Subtraction with zero",2,Calculator.subtract(2, 0));
	}
	
	@Test
	public void multest() {
		
		assertEquals("Mul Result",2,Calculator.multiply(1, 2));
		assertEquals("Mul with 2 negative nos.",2,Calculator.multiply(-1, -2));
		assertEquals("Mul with 1 negative no.",-4,Calculator.multiply(2, -2));
		assertEquals("Mul with zero",0,Calculator.multiply(2, 0));
	}
	
	@Test 
	public void divtestByZero() {
		
		assertEquals("Division by zero error",Calculator.divide(2, 0));
	}
	
	@Test
	public void divTest() {
		
		assertEquals(-2,Calculator.divide(-4, 2),0.00005);
		assertEquals(2,Calculator.divide(-4, -2),0.00005);
		assertEquals(2,Calculator.divide(4, 2),0.00005);
		assertEquals(0.5,Calculator.divide(2, 4),0.00005);
	}

}
