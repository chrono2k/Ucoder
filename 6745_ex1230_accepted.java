import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		float n1 = s.nextFloat();
		float n2 = s.nextFloat();
		float n3= s.nextFloat();
		s.close();
		if(n1 <n2&&n1<n3)
			System.out.println("1");
		else
			if(n2<n3)
				System.out.println("2");
			else
				System.out.println("3");
	}
}