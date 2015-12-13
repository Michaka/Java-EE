import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int number;
		int helper = 0;
		
		do{
			System.out.println(" Please enter a positive number.");
			number = in.nextInt();
		}while(number < 1);
		
		
		for(int index=1;index<=number;index++){
			helper+=index;
			
		}
		System.out.println(helper);
		in.close();
	}

}
