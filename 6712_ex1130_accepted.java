import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int C = (((s.nextInt() - 32) * 5) / 9);
		s.close();
		if (C > 0)
			System.out.println(C);
		else
			System.out.println(C - 1);
	}

}