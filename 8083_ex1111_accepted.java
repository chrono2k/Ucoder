import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ax = s.nextInt(),ay=s.nextInt();
		int bx = s.nextInt(),by=s.nextInt();
		boolean div = false;
		s.close();
		if((ax <= (num/2)&&bx>(num/2))||(ax >(num/2)&&bx<=(num/2))||(ay <= (num/2)&&by>(num/2))||(ay >(num/2)&&by<=(num/2))||(ax>ay&&bx<by)||(ax<ay&&bx>by))
			div =true;
			
		if(div)
			System.out.println("S");
		else
			System.out.println("N");
	}
}
