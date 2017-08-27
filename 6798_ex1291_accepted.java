import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String letr = s.next();
		s.close();
		String vog ="";
		String vogt="";
		String vogais="aeiou";
		for(int i =0;i<letr.length();i++){
			if(vogais.contains(letr.charAt(i)+""))
				vog+=letr.charAt(i);
			}
		for(int i=letr.length()-1;i>=0;i--){
			if(vogais.contains(letr.charAt(i)+""))
				vogt+=letr.charAt(i);
		}
		if(vogt.contentEquals(vog))
			System.out.println("S");
		else
			System.out.println("N");
	}
}