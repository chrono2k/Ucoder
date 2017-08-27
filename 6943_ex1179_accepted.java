import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int numero2 = 0;
		String num = "0";
		do {
			num = s.next();
			int numero = 0;
			int b = 0;
			numero2 = Integer.parseInt(num);
			if (numero2 != 0) {
				for (int j = 1; j < 10; j++) {
					numero = 0;
					for (int i = 0; i < num.length(); i++) {
						numero += Math.pow(
								Integer.parseInt(num.charAt(i) + ""), j);
						if (numero == numero2) {
							b = j;
						}
					}
				}
				if (b == 0) {
					System.out.println('N');
				} else
					System.out.println(b);
			}
		} while (numero2 != 0);
		s.close();
	}
}