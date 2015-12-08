import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int first_number,second_number,third_number,forth_number;
		first_number=in.nextInt();
		second_number=in.nextInt();
		third_number=in.nextInt();
		forth_number=in.nextInt();
		if(first_number<1 ||first_number>8|| second_number<1||second_number>8||third_number<1||third_number>8||forth_number<1||forth_number>8){
			System.out.println("The numbers are incorect. Please be sure all the numbers are between 1 and 8 next time.");
		}
		else{
			if((first_number+second_number)%2==(third_number+forth_number)%2){
				System.out.println("psoition with equal color");
			}
			else{
				System.out.println("positions with different color");
			}
		}
		in.close();

	}

}
