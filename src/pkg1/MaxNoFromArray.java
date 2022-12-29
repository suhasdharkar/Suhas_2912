package pkg1;

public class MaxNoFromArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 9, 4, 5, 6 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("maximum number of Array is: " + min);
	}
}
