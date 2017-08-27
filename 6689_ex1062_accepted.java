import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = ((s.nextInt() + s.nextInt()) - (s.nextInt() + s.nextInt()))*-1;
		s.close();
		System.out.println(n1);
	}
}
