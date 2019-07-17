package day1;

public class HelloWorld 
{
	private String Name;

	public String getMessage() 
	{
		return Name;
	}

	public void setMessage(String Name) 
	{
		this.Name = Name;
	}
	public static void main(String[] args)
	{
		HelloWorld obj=new HelloWorld();
		obj.setMessage("Hello World!");
		String name=obj.getMessage();
		System.out.println(name);
	}
}
