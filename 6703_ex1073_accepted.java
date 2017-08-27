import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		s.close();
		int v;
		if (a > b || a > c) {
			if (a > b && a > c) {
				if (c > b)
					v = c;
				else
					v = b;
			} else 
					v = a;
		} else 
			if (b > c)
				v = c;
			else
				v = b;
		System.out.println(v);

	}
}