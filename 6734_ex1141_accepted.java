import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = (s.nextInt()+s.nextInt())/2;
		s.close();
		if(n1>6){
			if(n1==10)
				System.out.println("APROVADO COM DISTINCAO");
			else
				System.out.println("APROVADO");
		}
		else
			System.out.println("REPROVADO");
	}
}