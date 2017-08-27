
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int c = 0;
		int num = s.nextInt();
		s.close();
		int n = num / 2;
		double nume = 1;
		do {

			if (nume == n+1) {
				nume=1;
			} else 
				if (nume <= n) {
				nume *= 2;
				} else
					if (nume > n) {
				nume = ((nume-n) *2)-1;

			} 
			c++;
		} while (nume > 1);
		System.out.println(c);
	}

}
