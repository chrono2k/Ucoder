import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1;
		int n2 = 0;
		int auxn2;
		int outax;

		do {
			int cont = 0;
			n1 = 0;
			n2 = 0;
			outax = 0;
			n1 = s.nextInt();
			if (n1 != 0) {

				for (int i = 0; i < n1; i++) {
					auxn2 = n2;
					n2 = s.nextInt();
					if (auxn2 + 10 > n2 && auxn2 != 0) {
						cont = cont - 10 + (n2 - auxn2);
					}

					for (int j = n2; j < n2 + 10; j++) {
						cont++;
					}

				}

				System.out.println(cont - outax);
			}
		} while (n1 != 0);
		s.close();

	}
}