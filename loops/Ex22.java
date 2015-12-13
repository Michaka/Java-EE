import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper=1,counter=1;
		do{
			System.out.println(" Please enter a number between 1 and 999.");
			number=in.nextInt();
		}while(number<1||number >999);
				
			helper=number+1;
			while(counter<=10){
				if(helper%2==0||helper%3==0||helper%5==0){
					System.out.print(counter+":"+helper+",");
					counter++;
				}
				helper++;
			}

		
		in.close();

	}

}
