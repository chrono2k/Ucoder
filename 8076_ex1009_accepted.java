import java.util.Scanner;


public class Main {
	public static void main (String args[]){
		Scanner s = new Scanner(System.in);
		
		for(int con =1;con<11;con++){
			boolean p = false;
			int c = s.nextInt(),co,otc,mx=0,my=0,bx=0,by=0;
			int cang [][]= new int [4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j <4; j++) {
					cang[i][j]=s.nextInt();
				}
			}		
			for (int i = 0; i < 4; i++) {
				co=0;
				otc=0;
				for (int j = 0; j <4; j++) {
					if(cang[i][j]==1)
						co++;
					if(cang[j][i]==1)
						otc++;
				}
				if(otc>2||otc<2){
					p=true;
					if(otc>2)
						my = i+1;
					else
						by = i+1;
				}
				if(co>2||co<2)
					if(co>2)
						mx =i+1;
					else
						bx=i+1;

			}	
			if(p)
			System.out.println("Caso "+c+": MOVER CANGURU DE ("+mx+","+my+") PARA ("+bx+","+by+")");
			else
				System.out.println("Caso "+c+": CORRETO");
		}
		s.close();
	}
}
