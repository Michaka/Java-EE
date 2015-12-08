import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number,helper,first_part,second_part,third_part;
		System.out.println("Enter number between 100 and 999:");
		number=in.nextInt();
		if(number<100||number >999){
			System.out.println("The number,is not correct. Please enter a number between 100 and 999, next time.");
		}
		else{
			helper=number;
			third_part=helper%10;
			helper/=10;
			second_part=helper%10;
			helper/=10;
			first_part=helper%10;
			if(first_part==0||second_part==0||third_part==0){
				System.out.println("the number contains zero.Please enter a number without zero");
			}
			else
			{
				if(number%first_part==0){
					System.out.println(number+" is devided by " +first_part);				
				}
				else{
					System.out.println(number+" is not devided by "+ first_part);
				}
				if(number%second_part==0){
					System.out.println(number+" is devided by " +second_part);					
				}
				else{
					System.out.println(number+" is devided by "+ second_part);
				}
				if(number%third_part==0){
					System.out.println(number+" is devided by " +third_part);	
				}
				else{
					System.out.println(number+" is devided by "+ third_part);
				}
				
			}
		}
		in.close();
	}

}
