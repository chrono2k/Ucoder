import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char car = s.nextLine().charAt(0);
		String palavra=s.nextLine();
		s.close();
		double palavras=0;
		double palavrasc=0;
		int j=0;
		for(int i =0;i<palavra.length();i++){
			if(palavra.charAt(i)==' '){
				palavras++;
				j=0;
			}
			else{
				if(palavra.charAt(i)==car&&j==0){
					j++;
					palavrasc++;
				}
			}
		}		palavras++;

		double porc=palavrasc/palavras*100;
		System.out.printf("%.1f",porc);
		System.out.println();
	
	}
}