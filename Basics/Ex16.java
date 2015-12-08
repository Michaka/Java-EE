import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number,first_part,second_part,third_part;
		System.out.println("Enter number between 100 and 999:");
		number=in.nextInt();
		if(number<100||number >999){
			System.out.println("The number,is not correct. Please enter a number between 100 and 999, next time.");
		}
		else{
			third_part=number%10;
			number=number/10;
			second_part=number%10;
			number/=10;
			first_part=number%10;
			number=0;
			if(first_part==second_part&& second_part==third_part){
				System.out.println("the numbers are equal");
				number=1;
			}
			if(first_part>second_part&& second_part>third_part){
					System.out.println("the numbers are deceasing");
					number=1;
			}
			if(first_part<second_part&& second_part<third_part){
				System.out.println("the numbers are increasing");
				number=1;
			}
			if(number!=1){
				System.out.println("ne sa podredeni");
			}
			
		}
		in.close();

	}

}
