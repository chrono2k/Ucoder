import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = s.nextInt();
		int dinheiro = 0;
		int df = 0;
		int troco = 0;
		do {

		 int c = s.nextInt();
		 while(c>0){
			dinheiro = s.nextInt()*s.nextInt();
			 
			 df+=dinheiro;
			 c--;
		 }
			troco = s.nextInt()-df;
			if(troco >= 0 )
				System.out.println(troco);
			else
				System.out.println("DINHEIRO INSUFICIENTE");
			df = 0;
			cont--;
		} while (cont> 0);
		s.close();

	}
}
