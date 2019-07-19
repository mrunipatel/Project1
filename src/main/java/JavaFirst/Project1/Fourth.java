package JavaFirst.Project1;

public class Fourth
{
	static int a=1,b=2,c;
	
	public static int Add(int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}
	public static void main(String args[])
	{
		c=Add(a,b);
		System.out.println("Value----  " +c);
	}
}