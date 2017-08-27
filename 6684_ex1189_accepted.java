import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n1, n2;
        n1 = s.nextInt();
        n2 = s.nextInt();
     
		if (n1 % 2 == 0) 
			n1--;
            
		int nn1 = 0, nn2 = 0;
		int vn1 = 0, vn2 = 0;
		int c = 1;
		int a = n1;
		while (vn1 <= vn2) {
			c++;
			for (int i = n2; i >= 0; i--) {
				nn2 = i;
				nn1 = a;
				a--;

				if (a == -1)
					a = n1;
				if (nn2 == 0)
					vn2++;
				if (nn1 == 0)
					vn1++;
			}

		}
               s.close();
		System.out.println(c);
	}
}