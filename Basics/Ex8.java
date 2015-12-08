import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number,helper;
		System.out.println("Enter number between 1000 and 9999:");
		number=in.nextInt();
		if(number<1000||number >9999){
			System.out.println("The number,is not correct. Please enter a number between 1000 and 9999, next time.");
		}
		else{
			helper=number%1000;
			number=number/1000;
			number=number*10+helper%10;
			helper/=10;
			if(helper==number){
				System.out.println("equal("+number+"=="+helper+")");
			}
			else{
				if(helper<number){
					System.out.println("greater("+number+">"+helper+")");					
				}
				else{
					System.out.println("less("+number+"<"+helper+")");
				}
			}
		}
		in.close();
	}

}
