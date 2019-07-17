package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() 
	{
		HelloWorld obj=new HelloWorld();
		obj.setMessage("Hello World!");
		String name=obj.getMessage();
		assertEquals("Hello World!",name);
	}

}
