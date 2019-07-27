package day1;

public class SumOfNumbers 
{
	int sumeven=0,sumodd=0,i;
	public int sumOfEvenNumbers(int start, int end)
	{
		for(i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				sumeven=sumeven+i;
			}
		}
		return sumeven;
	}
	public int sumOfOddNumbers( int start, int end)
	{
		for(i=start;i<=end;i++)
		{
			if(i%2==1)
			{
				sumodd=sumodd+i;
			}
		}
		return sumodd;
	}
}
