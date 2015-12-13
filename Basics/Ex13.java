import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number;
		System.out.println("Enter number between -100 and 100:");
		number=in.nextInt();
		if(number<(-100)||number >100){
			System.out.println("The tempereture,is not correct. Please enter a temperature between -100 and 100, next time.");
		}
		else{
			if(number<=(-20)){
				System.out.println("ice cold");
			}
			if(number>(-20)&&number<=0){
				System.out.println("cold");
			}
			if(number>0&&number<=15){
				System.out.println("coldly");
			}
			if(number>15&&number<=25){
				System.out.println("warm");
			}
			if(number>25){
				System.out.println("hot");
			}
			
		}
		in.close();

	}

}
