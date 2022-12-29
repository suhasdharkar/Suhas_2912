package mock;

public class Dowhile {
	public static void main(String[] args) {
		int q = 0;
		do {// System.out.println(q);
			++q;
		} while (q <= 10);

		System.out.println();

		int qq = 1;
		while (qq < 10) {

			qq++;
			System.out.println(qq);
			if (qq == 5) {
				continue;
			}
			;
		}
	}
}
