package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() 
	{
		int fact;
		Factorial f=new Factorial();
		fact=f.calculateFactorial(5);
		assertEquals(120,fact);
	}

}
