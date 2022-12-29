package programOfJava;

public class ovrloading {
	static int a=20;
	int b=50;
public static void method()
{
	int a=10;
	int b=20;
	System.out.println(a+b);
}
public static void method(int d)
{
	int a=d;
	
	System.out.println(a);
	
}
public static void method(int j,int e)
{
	int a=j;
	int b=e;
	System.out.println(a-b);
}
public static void main(String[] args) {
	
	method();
	method(22);
	method(100,20);
	System.out.println(a);
	
}
}
