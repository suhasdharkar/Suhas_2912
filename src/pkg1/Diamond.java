package pkg1;

public class Diamond {
	public static void main(String[] args) {
		for (int k = 1; k <= 5; k++) 
		{
			for (int i = k; i <= 5; i++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= k; j++) 
			{
				System.out.print("* ");
			}
			for (int z = 1; z <= 4; z++) 
			{
				for (int i = k; i <= 5; i++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= k; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for (int c = 1; c <= 4; c++) 
		{
			for (int a = 0; a <= c; a++) 
			{
				System.out.print(" ");
			}
			for (int b = 4; b >= c; b--) 
			{
				System.out.print("* ");
			}
			for (int z = 1; z <= 4; z++) 
			{
				for (int a = 0; a <= c; a++) 
				{
					System.out.print("  ");
				}
				for (int b = 4; b >= c; b--) 
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
