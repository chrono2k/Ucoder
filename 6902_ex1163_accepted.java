import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a = s.nextInt();
		int k = s.nextInt();
		String senha = s.next();
		int M = 0;
		int A = 0;
		int K = 0;
		s.close();

		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) > 64 && senha.charAt(i) < 91) {
				A++;
			} else {
				if (senha.charAt(i) > 96 && senha.charAt(i) < 123) {
					M++;
				} else if (senha.charAt(i) > 47 && senha.charAt(i) < 58) {
					K++;
				}
			}
		}
		if (A >= a && M >= m && K >= k && n <= senha.length())
			System.out.println("Ok =/");

		else
			System.out.println("Ufa :)");

	}
}