import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		s.close();
		int t = 0;
		if(n1>n2)
			t+=(n1-n2)*4;
	
		System.out.println(t);
	}
}