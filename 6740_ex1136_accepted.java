import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		s.close();
		int L = (n1 / 3) / 18;
		if (((float) n1 / 3) % 18 > 0) {
			L++;
		}
		System.out.println(L + " " + (L * 80));

	}
}