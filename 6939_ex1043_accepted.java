import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int numbers[] = new int[n1 + 1];
		for (int i = 0; i < n1; i++)
			numbers[i] = s.nextInt();
		numbers[n1] = 101;
		s.close();
		Arrays.sort(numbers, 0, numbers.length);
		int cont = 0;
		int outc = 0;
		int f = 0;
		int nu1 = numbers[0];
		if (n1 > 1) {
			for (int i = 1; i <= n1; i++) {
				if (nu1 == numbers[i] && i != n1) {
					cont++;
				} else {
					nu1 = numbers[i];
					if (cont > outc) {
						outc = cont;
						cont = 0;
						f = numbers[i - 1];
					} else if (cont == outc) {
						f = numbers[i - 1];
					}
					cont = 0;
				}

			}
			System.out.println(f);
		} else
			System.out.println(numbers[0]);

	}
}