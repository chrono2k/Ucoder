import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		for(int i =s.nextInt();i>0;i--){
			int nu =1;

			String es=s.next().toLowerCase();
			for(int j =0;j<es.length();j++){
				if(es.charAt(j)=='a'||es.charAt(j)=='e'||es.charAt(j)=='i'||es.charAt(j)=='o'||es.charAt(j)=='s'){
					nu*=3;
				}
				else{
					nu*=2;
				}
			}
			System.out.println(nu);
		}
		s.close();
	}
}//nota mental, eu sou muito burro ._., maldito 's'