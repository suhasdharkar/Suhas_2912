package mock;

public class this_sup extends inheri {
	int a = 10;
	int b = 20;

	public void method1() {
		int a = 50;
		int c = 15;
	}

	public static void method2() {
		int a = 60;
		int b = 29;
	}

	public void method3()

	{
		int a = 50;
		int b = 29;
		int c = 15;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);

	}

	public static void main(String[] args) {
		this_sup rt = new this_sup();
		rt.method3();

	}

}
