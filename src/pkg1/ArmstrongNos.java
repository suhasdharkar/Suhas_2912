package pkg1;

public class ArmstrongNos {
	public static void main(String[] args) {
		int num = 370;
		int i = 0;
		int j;
		while (num >0)
		{
			j= num%10;
			i = j*j*j+i;
			num = num /10;
			System.out.println(i);
		}
		//System.out.println (i);
		
	}

}
