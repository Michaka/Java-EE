import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number;
		System.out.println("Enter time :");
		number=in.nextInt();
		if(number<0||number >24){
			System.out.println("The time is not correct. Please enter an hour between 0 and 24, next time.");
		}
		else{
			if(number>=18&&number<=24||number>=0&&number<4){
				System.out.println("good night");
			}
			if(number>=4&&number<9){
				System.out.println("good morning");
			}
			if(number>=9&&number<18){
				System.out.println("good day");
			}			
		}
		in.close();
	}

}
