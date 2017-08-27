import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main (String args[]){
		Scanner s = new Scanner(System.in);
		double v[] = new double [5];
		double med =0;
		for (int i = 0; i < 5; i++) {
			v[i]=s.nextDouble();
			med+=v[i];
		}
		s.close();
		Arrays.sort(v);
		med/=5;

		System.out.printf("%.2f\n",v[3]);
		System.out.printf("%.2f\n",med);
		int maio = 0;
		int auxma =0;
		double num=0;;
		for(int i =0;i<5-1;i++){
			if(v[i]==v[i+1]){
				maio++;
			}
			else{
				if(maio>auxma){
					num =v[i-1];
					auxma=maio;
				}
				maio=0;

			}
			
		}
		System.out.printf("%.2f\n",num);
	
	}
}


