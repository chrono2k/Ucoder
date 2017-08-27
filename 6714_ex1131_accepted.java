import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int F = ((s.nextInt()* 9)/5) + 32;
		s.close();
		System.out.println(F);
	}

}