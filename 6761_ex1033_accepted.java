import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String p = s.nextLine()+"p";
		String dec="";
		for(int i =1;i<p.length();i+=2){
			if(p.charAt(i+1)==' '){
				dec+=p.charAt(i)+" ";
				i++;
			}
			else{
				dec+=p.charAt(i);
			}
			
		}
		System.out.println(dec);
		s.close();
	}
}