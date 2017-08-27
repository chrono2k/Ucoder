import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	int n1 = s.nextInt();
	int n2 = s.nextInt();
	if(n1%n2>n2%n1)
		System.out.println(n1%n2);
	else
		System.out.println(n2%n1);

	s.close();
	}
}