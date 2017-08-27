import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int f=0,f1=0;
		s.close();
		for(int i =1;i<1000000000;i++){
			f = n2 * i;

			if(f>n1){
				i=1000000000;
				f = n1-f1;
			}		
			else{
				f1=f;
			}

		}
		System.out.println(f);
	}
}