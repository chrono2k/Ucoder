import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,men,zeros;
		Scanner s = new Scanner(System.in);
		int q =s.nextInt();
		for (int i = 0; i <q; i++) {
			a = s.nextInt();
			men = (a - 1) * 2;
			zeros = (a * a) - (a + men);
			if(zeros>a+men)
				System.out.println("S "+zeros);
			else{
				if(zeros<0)
					System.out.println("N 0");
				else
				System.out.println("N "+zeros);		
			}
		}
	}
}
