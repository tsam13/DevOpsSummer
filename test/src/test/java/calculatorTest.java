import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//2
class calculatorTest {

	@Test
	void testAdd() {
		var calc = new calculator();
		assertEquals(15, calc.add(7,8));
		}

	@Test
	void testSubtract() {
		var calc = new calculator();
		assertEquals(8, calc.subtract(15,7));
	}

	@Test
	void testMultiply() {
		var calc = new calculator();
		assertEquals(15, calc.multiply(3,5));
	}
	
	

}
