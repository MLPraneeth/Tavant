package day1;

public class MarkValidatorSwitch 
{
	int r;
	public boolean isPass(int mark)
	{
		if(mark>=40)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public String markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark>90)
				r= 1;
			else if(mark>75)
				r= 2;
			else if(mark>60)
				r= 3;
			else
				r=4;
		}
		return grade();
	}
	public String grade()
	{
	int result=r;
	switch (result)
	{
	case 1: 
			return "Grade A";
	case 2: 
			return "Grade B";
	case 3: 
			return "Grade C"; 
	case 4:
			return "Grade D";
	default :
			return null;
	}
	}
	
}
