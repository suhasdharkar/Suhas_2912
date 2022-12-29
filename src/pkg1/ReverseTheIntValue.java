package pkg1;

import java.util.Scanner;

public class ReverseTheIntValue {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		long n=sc.nextLong();
		long b; 
		while (n > 0) {
			b = n % 10;
			n = n / 10;

			System.out.print(b);
		}

	}
}
