import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int ma = 0;
		String c = s.next();
		
		for (int i = 0; i <n1; i++) {
			if(c.charAt(i)=='D')
				ma++;
			else
				ma--;
		}

		s.close();
		if (ma < 0)
			ma *= -3;
		ma %= 4;
		switch (ma) {
		case 0:
			System.out.println("N");
			break;
		case 1:
			System.out.println("L");
			break;
		case 2:
			System.out.println("S");
			break;
		case 3:
			System.out.println("O");
			break;

		}

	}

}