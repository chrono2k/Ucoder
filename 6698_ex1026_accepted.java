import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt()%s.nextInt();
		s.close();
		
		System.out.println(a);
	}
}