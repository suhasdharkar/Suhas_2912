package mock;

import java.security.DomainCombiner;

public class StarPattern {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	

}
