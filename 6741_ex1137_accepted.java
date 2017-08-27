import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int mb = s.nextInt();
		float mbp = s.nextFloat()/8;
		int q = (int)(mb/mbp);
		s.close();		
		System.out.println(q);

	}
}