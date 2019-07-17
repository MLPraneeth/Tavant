package day1;

public class Temperature 
{
	public double convertToFarenheit(double celsius)
	{
		return ((celsius*1.8)+32);
	}
	public double convertToCelsius (double farenheit)
	{
		return (((farenheit-32)*5)/9);
	}
	
}
