import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int c = 0;
		do {
			c = s.nextInt();
			if (c >= 1&&c!=31) {
				int n1 = 31%c;
				System.out.println(n1);
			}
			else
				if(c==31)
					System.out.println("31");
		} while (c > 0);
		s.close();
	}
}