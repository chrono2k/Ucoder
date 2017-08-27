import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int da;
		int ma;
		int oda;
		int oma;
		boolean an = false;
		do {
			da = s.nextInt();
			ma = s.nextInt();
			if (da != 0 && ma != 0) {
				for (int i = s.nextInt(); i > 0; i--) {
					oda = s.nextInt();
					oma = s.nextInt();
					if (oda == da && oma == ma)
						an = true;
				}
				if (an == true)
					System.out.println("S");
				else
					System.out.println("N");
				an=false;
			}
		} while (ma != 0 && da != 0);
		s.close();

	}
}