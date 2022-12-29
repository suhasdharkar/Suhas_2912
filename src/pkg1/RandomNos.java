package pkg1;

import java.util.Random;

public class RandomNos {
public static void main(String[] args) {
	Random ran= new Random();
	int i=ran.nextInt(100);
	System.out.println(i);
}
}
