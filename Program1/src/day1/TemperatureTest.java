package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() 
	{
		double celsius,farenheit;
		Temperature temp=new Temperature();
		celsius=temp.convertToCelsius(95);
		farenheit=temp.convertToFarenheit(95);
		assertEquals(35,celsius);
		assertEquals(203,farenheit);
	}

}
