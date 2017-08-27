import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fech = s.nextInt();
		int fec[] = new int[n + 1];
		int cont = 0;
		for (int i = 0; i < n; i++) {
			fec[i] = s.nextInt();
		}

		for (int i = 0; i < n - 1;) {
			if (fec[i] < fech || fec[i] > fech) {
				if (fec[i] < fech) {
					fec[i]++;
					fec[i+1]++;
					cont++;
				} else {
					fec[i]--;
					fec[i+1]--;
					cont++;
				}

			} else
				i++;
		}
		System.out.println(cont);
		s.close();
	}
}
