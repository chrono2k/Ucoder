import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1;

		do {
			n1 = s.nextInt();
			if (n1 > 0) {
				int num = 0;

				for (int i = 1; i <= n1; i++) {
					num += Math.pow(2, i) - 1;
				}

				System.out.println(num);
			}
		} while (n1 > 0);
		s.close();
	}

}