import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,sum=0,helper;
		do{
			System.out.println(" Please enter a number between 2 and 27.");
			number = in.nextInt();
		}while(number < 2 || number>27);
		

		for(int i=100;i<=999;i++){
			helper=i;
			for(int j=0;j<3;j++){
				sum+=helper%10;
				helper/=10;
			}
			if(sum==number){
				System.out.println(i);
			}
			sum=0;
			
		}
		
		in.close();

	}

}
