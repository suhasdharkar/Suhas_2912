package programOfJava;

public class Simple {

	public static void main(String[] args) {

	for(int a=0;a<=5;a++) {
		for(int b=0;b<=5;b++) {
			if(a==0||b==5||a==5||b==0) {
			System.out.print("* ");}
			else {
				System.out.print("  ");}
		}
		System.out.println();
	}

	}

}
