import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper;
		
		do{
			System.out.println(" Please enter a number between 10 and 99.");
			number=in.nextInt();
		}while(number<10||number>99);
		
		helper=number;
		
		while(helper>1){
			if(helper%2==0){
				helper=helper/2;
			}
			else{
				helper=(helper*3)+1;
			}
			System.out.println(helper);
		}
		
		in.close();
		
	}
	
}
