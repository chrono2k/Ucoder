import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
		s.close();
		if((a== b +c +d)&&(b+c == d)&&(b==c))
			System.out.println("S");
		else
			System.out.println("N");
	}
}