import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int first_number,second_number,third_number;
		System.out.println("Enter the first number:");
		first_number=in.nextInt();
		System.out.println("Enter the second number:");
		second_number=in.nextInt();
		System.out.println("Enter the third number:");
		third_number=in.nextInt();
		if(first_number==second_number|| second_number==third_number||first_number==third_number){
			System.out.println("There are equal numbers. Please be sure all the numbers are different next time.");
		}
		else{
			if(first_number>second_number ){
				if(second_number<third_number){
					second_number=(third_number^second_number);
					third_number=(third_number^second_number);
					second_number=(third_number^second_number);
				}
				else{
					first_number=(first_number^second_number);
					second_number=(first_number^second_number);
					first_number=(first_number^second_number);			
				}
			}
			if(first_number<second_number){
				if(first_number>third_number){
					second_number=(third_number^second_number);
					third_number=(third_number^second_number);
					second_number=(third_number^second_number);
					first_number=(first_number^second_number);
					second_number=(first_number^second_number);
					first_number=(first_number^second_number);	
				}
				if( second_number>third_number){
					first_number=(first_number^second_number);
					second_number=(first_number^second_number);
					first_number=(first_number^second_number);	
					second_number=(third_number^second_number);
					third_number=(third_number^second_number);
					second_number=(third_number^second_number);
				}
				else{
					first_number=(first_number^third_number);
					third_number=(first_number^third_number);
					first_number=(first_number^third_number);	
				}
			}
			System.out.println(first_number +" "+second_number+" "+third_number);
		}
		in.close();
	}
}
