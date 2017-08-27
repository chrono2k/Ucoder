
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt()/2;
		int b=s.nextInt()/3;
		int c=s.nextInt()/5;
		s.close();
		if(a<b&&a<c)
		System.out.println(a);
		else
			if(b<c)
				System.out.println(b);
			else
				System.out.println(c);
	}
}