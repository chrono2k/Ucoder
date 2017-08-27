import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int con = s.nextInt();
		double x ,y,r,b,c;
		for (int i = 0; i < con; i++) {
			x = s.nextInt();
			y = s.nextInt();
			r = Math.pow((3 * x), 2) + Math.pow(y, 2);
			b = (2 * (Math.pow(x,2)) + (Math.pow((5*y), 2)));
			c = (-100 * x) + Math.pow(y,3);

			if (r > b || r > c) {
				if(r>b&&r>c)
					System.out.println("Rafael ganhou");
				else
					if(b>c)
						System.out.println("Beto ganhou");
					else
						System.out.println("Carlos ganhou");
			}
			else
				if (b>c)
					System.out.println("Beto ganhou");
				else
					System.out.println("Carlos ganhou");
		}
		s.close();
	}
}