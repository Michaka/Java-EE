
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	
		int number;
		char symbol;
		do{
			System.out.println(" Please enter a number between 3 and 20.");
			number=in.nextInt();
			System.out.println(" Please enter a symbol.");
			symbol = in.next().charAt(0);
		}while(number<3||number>20);
		for(int index=0;index<number;index++){
			for(int indexTwo=0;indexTwo<number;indexTwo++){
				if(index>0 && index<(number-1) && indexTwo>0 && indexTwo<(number-1)){
					System.out.print(symbol+" ");
				}
				else{
					System.out.print("* ");
				}
				
			}
			
			System.out.println();
		}
		
		in.close();
	}

}
