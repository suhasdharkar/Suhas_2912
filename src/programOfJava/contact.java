package programOfJava;

public class contact {
	int num1;
	int num2;
	int num3;
	
	public contact()
	{
		num1=10;
		num2=15;
		num3=20;
		
	}
	public contact(int a)
	{
		num1=a;
	}
	public contact(int a, int b)
	{
		num1=a;
		num2=b;
		
	}
	public contact(int a, int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	public void addition()
	{
		int sum= (num1+num2+num3);
		System.out.println("addition is "+sum);
	}
	public static void main(String[] args) {
		contact i= new contact();
		contact j= new contact(25);
		contact k= new contact(30,40);
		contact l= new contact(50,60,70);
		
		i.addition();
		j.addition();
		k.addition();
		l.addition();
	}
}
