package programOfJava;

public class canarabank implements Rbibank{

	public void intrest()
	{
		System.out.println("3%");
	}
	public void minbal()
	{
		System.out.println(500);
	}
	public void wdlim()
	{
		System.out.println(40000);
	}
	public static void main(String[] args) {
		canarabank hj=new canarabank();
		hj.intrest();
		hj.minbal();
		hj.wdlim();
	}
}
