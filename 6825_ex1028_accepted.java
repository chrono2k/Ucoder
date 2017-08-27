import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		s.close();
		if ((n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2)
				|| (n1 < n2 + n4 && n2 < n1 + n4 && n4 < n1 + n2)
				|| (n1 < n3 + n4 && n3 < n1 + n4 && n4 < n1 + n3)
				|| (n2 < n3 + n4 && n3 < n2 + n4 && n4 < n2 + n3))
			System.out.println("S");
		else
			System.out.println("N");
	}
}