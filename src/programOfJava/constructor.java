package programOfJava;

public class constructor {
	String fruit = "apple";
	String  name= "suhas";
	
	//public constructor()
	{
	
	}
	public void superb()
	{
		int sum= 10+20+30;
		System.out.println("addition will be "+sum);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("hello Friends");
		constructor a= new constructor();
		a.present();
		
		
	}
	 void present()
	{
		
		System.out.println("my name is " +name);
		System.out.println("i like to eat " +fruit);
		System.out.println("I like to save water");
	}
	

}
