import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = 0;
		int cont = 1;
		do {
		 n1=s.nextInt();
			if (n1 != 0) {
				int n2 = s.nextInt();
				if (n1 == n2) {
					System.out.println("Instancia " + cont);
					System.out.println("empate");
					System.out.println();
				} else {
					if ((n1 == 1 && n2 == 3) || (n1 == 2 && n2 == 1)
							|| (n1 == 3 && n2 == 2)) {
						System.out.println("Instancia " + cont);
						System.out.println("primeiro");
						System.out.println();
					} else {
						System.out.println("Instancia " + cont);
						System.out.println("segundo");
						System.out.println();
					}
				}
			}
			cont++;
		} while (n1 > 0);
		s.close();
	}
}