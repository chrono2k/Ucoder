import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		int n5 = s.nextInt();
		s.close();
		if (n1 > n2 && n2 > n3 && n3 > n4 && n4 > n5)
			System.out.println("D");

		else 
			if (n5 > n4 && n4 > n3 && n3 > n2 && n2 > n1)
			System.out.println("C");

		else
			System.out.println("N");
	}
}