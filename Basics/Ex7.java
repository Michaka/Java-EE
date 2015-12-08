import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int years;
		double money_i_have;
		boolean i_am_sick;
		System.out.println("Enter the years:");
		years=in.nextInt();
		System.out.println("Enter the amount of money:");
		money_i_have=in.nextDouble();
		System.out.println("Enter if i am sick(true/false):");
		i_am_sick=in.nextBoolean();
		if(i_am_sick){
			System.out.print(" I am sick, i wont go out, ");
			if(money_i_have>0){
				System.out.println(" I will buy myself some medicine");
			}
			else{
				System.out.println(" I will stay home and drink tea");
			}
		}
		else{
			System.out.print(" I am healthy, ");
			if(money_i_have<10){
				System.out.println(" I will go to a caffee");
			}
			else{
				System.out.println( "me and my friends will go to the cinema");
			}
		}
		in.close();
	}

}
