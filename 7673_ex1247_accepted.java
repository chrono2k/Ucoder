import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int co = s.nextInt();
		int nm = s.nextInt();
		int cont = 0;
		for (int i = 0; i < co; i++) {
			int num =s.nextInt()+s.nextInt();
			if (num>=nm)
				cont++;
		}
		s.close();
		System.out.println(cont);
	}
}
