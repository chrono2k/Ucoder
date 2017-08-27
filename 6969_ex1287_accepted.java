import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		s.close();
		int a1 = 1;
		int a2 = 1;
		boolean be = false;

		if (a != 1) {
			a1 = a * 2;
			a2 = a * 2 + 1;
			if (c % a1 == 0) {
				for (int i = a1 / 2; i > 0; i--) {
					int num = i % a1;
					if (num == 0 && i == b) {
						be = true;
						i = a1;
					}
				}
			}
			if (c % a1 == 0 && be == false && d % a1 != 0&&a1!=b&&a!=b){
				System.out.println(a1);
			}
			else {
				if (c % a2 == 0) {
					for (int i = a2 / 2; i > 0; i--) {
						int num = i % a2;
						if (num == 0 && i == b) {
							be = true;
							i = a2;
						}
					}
				}
				if (c % a2 == 0 && be == false && d % a2 != 0&&a2!=b&&a!=b)
					System.out.println(a2);
				else
					System.out.println("-1");
			}
		} else {
			do {
				if (c % a1 == 0) {
					for (int i = a1 / 2; i > 0; i--) {
						int num = i % a1;
						if (num == 0 && i == b) {
							be = true;
							i = a1;
						}
					}
				}
				
				if (c % a1 == 0 && be == false && d % a1 != 0&& a1!=b&&a!=b) {
					System.out.println(a1);
					a1 = 10000;
				} else {
					a1++;
					if(a1==9999)
						System.out.println("-1");
				}
			} while (a1 < 10000);
		}

	}
}