import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		if (a == b || a == c || b == c || a + b == c || a + c == b
				|| c + b == a || a - b == c || a - c == b || b - c == a
				|| b - a == c || c - a == b || c - b == a)
			System.out.println('S');
		else
			System.out.println('N');

	}

}
