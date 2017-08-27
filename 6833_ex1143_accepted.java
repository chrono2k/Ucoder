import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		String fi = "";
		int na;
		Scanner s = new Scanner(System.in);
		int c;

		do {
			c = s.nextInt();
			na = 2114;
			if (c != 0) {
				for (int i = 0; i < c; i++) {
					String ga = s.next();
					int an = s.nextInt() - s.nextInt();
					if (an < na) {
						na = an;
						fi = ga;
					}
				}
				System.out.println(fi);
			}
		} while (c != 0);
		s.close();
	}
}