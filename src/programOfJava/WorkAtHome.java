package programOfJava;

public class WorkAtHome 
{
	public static void ade()
	{
		int a=10;
		int b=12;
		int c=a+b;
		System.out.println(c);
	}
	public static void ade(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ade();
		ade(11,12);
	}
}