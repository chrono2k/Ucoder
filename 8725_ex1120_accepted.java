import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int q []= new int [a];
		String q2 []= new String[a];
		int q3[]= new int[a];
		for(int i= 0;i<a;i++){
			q[i]=s.nextInt();
			q2 [i]=s.next();
			q3 [i]=s.nextInt();
		}
		s.close();
		String text="";
		int ini2 =0;
		for(int i=0;i<=a;){
				if(ini2==q[i]){
				text+=""+q2[i];
				ini2=q3[i];
				i=0;
				if(ini2==1){
					break;
				}
			}else
					i++;
		}
		System.out.println(text);
	}
}
