import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n, max = 1, min;
		n = s.nextInt();
		s.close();
		int i = 0;
		min = (int) Math.pow(10, n - 1) * 2;
		max = (int) Math.pow(10, n) - min;
		int tex = min;
		boolean p = true;
		for (; min < max;) {
			int nimo = (int) Math.pow(10, n - 1);
			while (i != 9 || nimo > 2) {
				i = min / nimo;
				for (int j = 2; j <= Math.sqrt(i); j++)
					if (i % j == 0) {
						p = false;
						min += nimo;
						break;
					}
				if (p && nimo > 1)
					nimo /= 10;
				else
					break;
			}
			if (p && i >= tex) {
				System.out.println(min);
				min++;
			}
			p = true;
		}
	}
}
