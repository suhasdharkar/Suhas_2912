package programOfJava;
import mock.inheri;
public class Mobile  { // extends This_sup{
	public void method1()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void method2()
	{
		int c=30;
		int d=40;
		System.out.println(c-d);
	}
		public static void main(String[] args) {
			Mobile a=new Mobile();
			a.method1();
			method2();
			Mobile b=new Mobile();
		//	b.present();
			
		}
	

}
