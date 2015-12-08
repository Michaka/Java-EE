import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int first_number,second_number;
		System.out.println("Enter the first number:");
		first_number=in.nextInt();
		System.out.println("Enter the second number:");
		second_number=in.nextInt();
		if(first_number==second_number){
			System.out.println("The numbers are equal. Please enter different numbers.");
		}
		else{
			first_number=(first_number^second_number);
			second_number=(first_number^second_number);
			first_number=(first_number^second_number);
			System.out.println("the first number is: "+first_number+", the second number is: "+second_number);
		}
		in.close();
	}

}
