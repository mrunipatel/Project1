package JavaFirst.Project1;

public class Third
{

	public static void  Add (int x, int y)
	{		
		int z;
		z=x+y;
		display(z);
	}
	public  static void display (int m)
	{
		System.out.println("Value == " +m);
	}
	public static void main(String args[])
	{
		int a=1,b=2;
		Add(a,b);
	}
}