package mavenfactorialTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mavenfactorial.Factorial;

class FactorialTest {
	private Factorial factorial = new Factorial();
	
	@Test
	void test1() {
		assertEquals(0, factorial.reverseFactorial(1));
	}
	
	@Test
	void test2() {
		assertEquals(-1, factorial.reverseFactorial(0));
	}
	
	@Test
	void test3() {
		assertEquals(-1, factorial.reverseFactorial(-1));
	}
	
	@Test
	void test4() {
		assertEquals(5, factorial.reverseFactorial(120));
	}

}
