import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,counter=0;
		do{
			System.out.println(" Please enter a positive number .");
			number=in.nextInt();
		}while(number<1);
		for(int index=1;index<=number;index++){
			if(number%index==0){
				counter++;
			}
		}
		if(counter==2){
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime.");
		}
		in.close();


	}

}
