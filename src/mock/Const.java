package mock;


	public class Const 
	{
		 int a;//101
		private Const(int value)
		{
			a=value;
			System.out.println(a);
		}
		public static void main(String[] args) 
		{
			Const c=new Const(101);
			System.out.println(c.a);
		}
		

	}


