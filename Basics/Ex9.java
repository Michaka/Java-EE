import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int first_number,second_number,product;
		System.out.println("Enter the first number between 10 and 99:");
		first_number=in.nextInt();
		System.out.println("Enter the second number between 10 and 99:");
		second_number=in.nextInt();
		if(first_number < 10 || first_number > 99 || second_number < 10 || second_number > 99){
			System.out.println("There is a number,which is not correct. Please enter a numbers between 10 and 99, next time.");
		}
		else{
			product=first_number*second_number;
			if((product%10)%2==0){
				System.out.println(product+","+(product%10)+"  evan.");
			}
			else{
				System.out.println(product+","+(product%10)+"  odd");
				}
		}
		in.close();
	}

}
