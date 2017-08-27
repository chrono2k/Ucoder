import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		int i = a-1;
		while (i>0) {
			a*=i;
			i--;
		}
		
			System.out.println(a);
	}
}