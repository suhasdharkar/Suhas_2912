package pkg1;

public class Triangle {
	public static void tri() {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			for(int j=a;j<5;j++) {
				System.out.print("    ");
			}
			for(int i=1;i<=a;i++) {
				System.out.print("* ");
			}
			System.out.println();}
		for(int a=0;a<5;a++) {
			for(int c=4;c>a;c--) {
				System.out.print("* ");
			}
			for(int o=0;o<=a;o++) {
				System.out.print("    ");
			}
			for(int p=4;p>a;p--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		tri();
	}

}
