import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper=1;
		do{
			System.out.println(" Please enter a positive number .");
			number=in.nextInt();
		}while(number<0);
		helper=number-1;
		
		for(int index=0;index<number;index++){
			for(int indexTwo=0;indexTwo<number;indexTwo++){
				System.out.print(helper);
			}
			helper+=2;
			System.out.println();
		}
		in.close();
	}

	

}
