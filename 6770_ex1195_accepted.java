import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String[] cod = new String[5];
		String[] COD = new String[5];
		for (int i = 0; i < 5; i++)
			cod[i] = s.next().charAt(0) + "";

		for (int i = 0; i < 5; i++)
			COD[i] = s.next().charAt(0) + "";

		int se = 0;
		s.close();
		for (int i = 0; i < 5; i++)
			if (COD[i].charAt(0) == cod[i].charAt(0))
				se++;

		se *= 2;
		System.out.println(se);
	}

}