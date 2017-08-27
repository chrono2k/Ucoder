import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		s.close();
		if (n1 == n3 || n2 == n4) {
			System.out.println("V");
		} else
			System.out.println("F");
	}
}