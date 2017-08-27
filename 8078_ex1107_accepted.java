import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt(), oq = s.nextInt();
		int p[] = new int[q];
		int ultn[] = new int[q];

		for (int i = 0; i < oq; i++) {
			for (int j = 0; j < q; j++) {
				int h = s.nextInt();
				p[j] += h;
				ultn[j] = h;
			}
		}
		s.close();
		int tex = 0;
		int fin = 0;
		for (int i = 0; i < q; i++) {
			if (p[i] >= tex) {
				if (p[i] > tex) {
					tex = p[i];
					fin = i + 1;
				} else {
					if(ultn[i]>=ultn[i-1]){
						tex = p[i];
						fin = i + 1;	
					}

				}
			}
		}
		System.out.println(fin);

	}
}
