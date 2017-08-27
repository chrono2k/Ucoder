import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int cont = 0;
		boolean p1 = false;
		boolean p2 = false;
		for (int i = 0; i < n1; i++) {
			int n2 = s.nextInt();
			if (n2 == 1) {
				p1 = true;
				p2 = false;
			} else {
				if (p2 == true) {
				 p1=false;
				 p2=false;
					cont++;
				} else {
					if (p1 == true) {
						if (n2 == 0) {
							p2 = true;
						}
					}
				}
			}

		}
		s.close();
		System.out.println(cont);
	}
}