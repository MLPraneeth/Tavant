package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchTest {

	@Test
	void test() 
	{
		boolean result;
		String grade;
		MarkValidatorSwitch mv=new MarkValidatorSwitch();
		result=mv.isPass(90);
		grade=mv.markGrade(90);
		assertEquals(true,result);
		assertEquals("Grade B",grade);
	}

}
