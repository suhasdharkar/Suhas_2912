package pkg1;

public class factorial {

	public static void main(String[] args) {
		int f=0,x=0;
		for(int i=5;i>=1;i--) {
			 int d=i-1;
			f=i*d;
			System.out.println(f);
			x=f+x;
		}
		System.out.println("factorial of 5 is="+x);
	}

}
