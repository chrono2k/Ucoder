import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		int se = s.nextInt();
		s.close();
		if (se == 1)
			a = (62.1 * a) - 44.7;
		else
			a = (72.7 * a) - 58;

		System.out.printf("%.2f", a);
		System.out.println();
	}

}