import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int co = s.nextInt();
		for(int i =0;i<co;i++){
			int a =s.nextInt();
			int pes[] =new int [a],po []= new int [a];
			for(int j=0;j<a;j++){
				pes[j]=s.nextInt();
				po[j]=pes[j];
			}
			Arrays.sort(po);
			int cont =0;
			for(int j =0;j<a;j++)
				if(po[a-1-j]==pes[j])
					cont++;
			System.out.println(cont);
				
		}
		s.close();
		
	}
}
