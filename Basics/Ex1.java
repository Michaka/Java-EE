import java.util.Scanner;
public class Ex1 {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double first_number,second_number,third_number;
		System.out.println("Enter the first number:");
		first_number=in.nextDouble();
		System.out.println("Enter the second number:");
		second_number=in.nextDouble();
		System.out.println("Enter the third number:");
		third_number=in.nextDouble();
		if(third_number>first_number && third_number<second_number){
			System.out.println("the number "+third_number+" is between "+first_number+" and "+second_number);
		}
		else{
			System.out.println("the number "+third_number+" is not between "+first_number+" and "+second_number);
		}
		
		in.close();
	}

}
