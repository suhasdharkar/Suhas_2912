package pkg1;

import java.util.Scanner;

public class StarPatternTriangle {
	 
	public static void main(String [] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter Your Data: ");
		int original=scr.nextInt();
		int reminder=0, reverse=0;
		int i1=original;
		while(i1>0) {
			reminder=i1%10;
			i1=i1/10;
			reverse=reverse*10+reminder;
		}
//		System.out.println(reverse+" Reversed number");
//	System.out.println(original+" Original number");
		if(original==reverse) {
			System.out.println("given number is palindrome number");
		}else {
			System.out.println("given number is not palindrome number");
		}
		}
	}
	

