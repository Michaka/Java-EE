import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper=1;
		number=in.nextInt();
		do{
			helper*=number;
			number--;	
		}while(number>0);
		System.out.println(helper);
		
		in.close();

	}

}
