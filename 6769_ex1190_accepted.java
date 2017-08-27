import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = 0;
		int c = 0;
		for (int i = 1; i <= a; i++) {
			b += s.nextInt();
			if (b >= 1000000) {
				c = i;
				i = a;
			}
		}
		System.out.println(c);
		s.close();

	}
}