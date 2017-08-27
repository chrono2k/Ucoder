import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t1 = s.nextInt() + s.nextInt() + s.nextInt() + s.nextInt() - 3;
		s.close();

		System.out.println(t1);

	}
}