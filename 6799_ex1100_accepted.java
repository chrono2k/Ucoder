import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		s.close();
		if (n1 == n2)
			System.out.println(n1);
		else {
			if (n1 > n2)
				System.out.println(n1);
			else
				System.out.println(n2);
		}
	}
}
