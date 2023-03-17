import static org.junit.Assert.*;

import org.junit.Test;

import mavenfactorial.Factorial;

public class FactorialTest {

	private Factorial factorial = new Factorial();
	
	@Test
	public void test1() {
		assertEquals(0, this.factorial.returnFactorial(1));
	}
	
	@Test
	public void test2() {
		assertEquals(5, this.factorial.returnFactorial(120));
	}

}
