package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() 
	{
		int sumeven,sumodd;
		SumOfNumbers sm=new SumOfNumbers();
		sumeven=sm.sumOfEvenNumbers(1,10);
		sumodd=sm.sumOfOddNumbers(1,10);
		assertEquals(30,sumeven);
		assertEquals(25,sumodd);
		
	}

}
