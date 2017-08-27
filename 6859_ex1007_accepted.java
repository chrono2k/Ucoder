import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int num = 1;
		double eur = 1;
		while (a >= 0) {
			if (a == 0) {
				System.out.println("1.000000");
			} else {
				for (int i = 1; i < a; i++,num*=i,eur+=(double)1/num) {
				}
				num=1;
				
				System.out.printf("%.6f",eur+1);
				System.out.println();
				eur=1;
			}
			a = s.nextInt();
		}
		s.close();

	}

}
