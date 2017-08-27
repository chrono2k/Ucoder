import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = s.nextInt();

		while(cont>0){
			String n =s.next();
			String n2=s.next();
			int nu1=(Integer.parseInt(n.charAt(n.length()-1)+"")+Integer.parseInt(n2.charAt(n2.length()-1)+""));
		
			if(nu1%2==0)
				System.out.println("Par");
			else
				System.out.println("Impar");
			cont--;
		}
		s.close();
	}
}
