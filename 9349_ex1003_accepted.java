import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a, b;
		do {
			a = s.nextInt() + 2;
			b = s.nextInt() + 2;
			if (a != 2) {
				String v[][] = new String[a][b];
				for (int i = 0; i < b; i++) {
					v[0][i] = "0";
					v[a - 1][i] = "0";
				}
				for (int i = 0; i < a; i++) {
					v[i][0] = "0";
					v[i][b - 1] = "0";
				}
				for (int i = 1; i < a - 1; i++) {
					for (int j = 1; j < b - 1; j++) {
						v[i][j] = s.next();
					}
				}
				boolean pod = true;
				for (int i = 1; i < a - 1; i++) {
					for (int j = 1; j < b - 1; j++) {
						if (v[i][j].equals("A")) {
							if (v[i][j + 1].equals("B")
									|| v[i][j - 1].equals("B")
									|| v[i + 1][j].equals("B")
									|| v[i - 1][j].equals("B")
									|| v[i][j + 1].equals("D")
									|| v[i][j - 1].equals("D")
									|| v[i + 1][j].equals("D")
									|| v[i - 1][j].equals("D"))
								pod = false;
						} else {
							if (v[i][j].equals("B")) {
								if (v[i][j + 1].equals("A")
										|| v[i][j - 1].equals("A")
										|| v[i + 1][j].equals("A")
										|| v[i - 1][j].equals("A")
										|| v[i][j + 1].equals("C")
										|| v[i][j - 1].equals("C")
										|| v[i + 1][j].equals("C")
										|| v[i - 1][j].equals("C"))
									pod = false;

							} else if (v[i][j].equals("D")) {
								if (v[i][j + 1].equals("A")
										|| v[i][j - 1].equals("A")
										|| v[i + 1][j].equals("A")
										|| v[i - 1][j].equals("A"))
									pod = false;

							} else {
								if (v[i][j].equals("C"))
									if (v[i][j + 1].equals("B")
											|| v[i][j - 1].equals("B")
											|| v[i + 1][j].equals("B")
											|| v[i - 1][j].equals("B"))

										pod = false;
							}
						}
					}
				}
				if (pod)
					System.out.println('V');
				else
					System.out.println('F');
			}
		} while (a != 2);
	}
}
