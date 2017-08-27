import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		while (c >= 0) {
			int At = s.nextInt();
			int Ad = s.nextInt();
			int Bt = s.nextInt();
			int Bd = s.nextInt();
			int mon = s.nextInt();
			int cont = 0;

			mon -= At;
			if (mon <= 0) {
				System.out.println("Andre");
				c--;
			} else {
				mon -= Bt;
				if (mon <= 0){
					System.out.println("Beto");
					c--;
				}
				else {
					while (mon > 0) {
						cont++;
						if (cont % Ad == 0) {
							mon -= At;
							if (mon <= 0)
								System.out.println("Andre");
						}
						if (cont % Bd == 0 && mon > 0) {
							mon -= Bt;
							if (mon <= 0)
								System.out.println("Beto");
						}

					}
				}
				c--;
			}
		}
		s.close();
	}
}