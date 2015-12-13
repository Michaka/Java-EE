import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int first_number,second_number,sum,differnece,product,quotient,reminder;
		System.out.println("Enter the first number:");
		first_number=in.nextInt();
		System.out.println("Enter the second number:");
		second_number=in.nextInt();
		if(first_number==second_number){
			System.out.println("The numbers are equal. Please enter different numbers next time.");
		}
		else{
			sum=first_number+second_number;
			differnece=first_number-second_number;
			product=first_number*second_number;
			quotient=first_number/second_number;
			reminder=first_number%second_number;
			System.out.println( "the sum is: "+sum+
								"\nthe differnece is: "+differnece+
								"\nthe product is: "+product+
								"\nthe quotient is: "+quotient+
								"\nthe reminder is: "+reminder);
		}
		in.close();
	}
	

}
