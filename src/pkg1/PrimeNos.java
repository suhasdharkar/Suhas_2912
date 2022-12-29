package pkg1;

public class PrimeNos {
	public static void main(String[] args) {
		int n=7,a=0;
		for(int k=1;k<=n;k++) {
			if(n%k==0) 
				a++;
		}
			if(a==2) {
				System.out.println("no is prime");
			}else {
				System.out.println("no is not prime");
			}
			 
			
		
	}

}
