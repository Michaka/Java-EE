import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,counter=0,helper=3;
		
		do{
			System.out.println(" Please enter a positive number .");
			number=in.nextInt();
		}while(number<1);
		while(counter<number){
				if(helper%3==0){
					System.out.print(helper+", ");
					counter++;
				}
				helper++;
			}
			
		in.close();

	}

}
