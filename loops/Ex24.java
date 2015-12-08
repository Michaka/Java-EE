import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper=0,numberCopy;
		do{
			System.out.println(" Please enter a number between 10 and 30000.");
			number=in.nextInt();
		}while(number<10||number >30000);
			
		
		
			numberCopy=number;
			do{
				helper+=numberCopy%10;
				numberCopy/=10;
				helper*=10;
			}while(numberCopy>0);
			if(helper==number){
				System.out.println("the number is palindrome");
			}
			else{
				System.out.println("the number is not palindrome");
			}
		
		
		in.close();

	}

}
