import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = 0;
		s.close();
		if (a > b || a > c) {
			if (b < c) {
				d = a;
				a = b;
				b = d;
			} else {
				d = a;
				a = c;
				c = d;
			}
		}
		if (b > c) {
			d = b;
			b = c;
			c = d;
		}
		System.out.println(c + "\n" + b + "\n" + a);
	}
}