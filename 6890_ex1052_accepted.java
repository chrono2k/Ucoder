import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		double d1 = s.nextDouble()/s.nextDouble();
		int n2 = s.nextInt();
		double d2 = s.nextDouble()/s.nextDouble();
		s.close();
		if(d1<d2)
			System.out.println(n1);
		else
			System.out.println(n2);
	}
}