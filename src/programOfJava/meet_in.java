package programOfJava;

public class meet_in extends meet{
	public void method1() {
		System.out.println("hii am method1 from subclass");
	}
	public void method2()
	{
		System.out.println("hi am method2 from subclass");
	}
	public static void main(String[] args) {
		meet_in obj=new meet_in();
		obj.method1();
		
	}

}
