import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = 1;
		do {

			a = s.nextInt();
			if (a != 0) {
				int f = 0;
				for (int i = a; i > 0; i--) {
					f += i;
				}
				System.out.println(f);
			}
		} while (a != 0);
		s.close();

	}
}