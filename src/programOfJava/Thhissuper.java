package programOfJava;

public class Thhissuper extends company{
static int a=10;
int b=19;
public void method1()
{
	System.out.println(a);
	System.out.println(this.b);
	System.out.println(super.b);
	System.out.println(super.a);
}
public static void main(String[] args) {
	Thhissuper obj=new Thhissuper();
//	System.out.println(a);
//	System.out.println(obj.b);
	obj.method1();
}
}
