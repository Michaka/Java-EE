import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number;
		do{
			System.out.println(" Please enter a number between 10 and 200.");
			number = in.nextInt();
		}while(number < 10 || number>200);
		
		
		for(int i=number;i>0;i--){
			if(i%7==0){
				System.out.println(i);
			}
			
			
		}
		
		in.close();
	}

}
