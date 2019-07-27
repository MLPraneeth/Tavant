package day1;

public class Factorial 
{
	int fact=1,i;
	public int calculateFactorial(int number)
	{
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
