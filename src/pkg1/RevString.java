package pkg1;

import java.util.Scanner;

public class RevString{
	static String newStr;
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);	
	System.out.println("Enter The String: ");
	String str=sc.next();
	for(int i=str.length()-1;i>=0;i--) {
	char ch=str.charAt(i);
//	System.out.println(str.toCharArray());
	newStr=Character.toString(ch);
	System.out.print(newStr);
	}
	

	}
}