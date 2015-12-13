import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int numberOne,numberTwo,sum=0,counter,step=1,limit;
		
	
		System.out.println(" Please enter first number .");
		numberOne = in.nextInt();
		System.out.println(" Please enter second number .");
		numberTwo = in.nextInt();
		
		if(numberTwo<numberOne){
			step=-1;
			limit=numberOne;
			counter=numberTwo;
		}
		else{
			step=1;
			counter=numberOne;
			limit=numberTwo;
		}
		while(sum<=200 && counter<=limit){
			if(counter%3==0){
				System.out.print("skip 3, ");
			}
			else{
				
				sum+=counter*counter;
				System.out.print(counter*counter+", ");
			}
			counter+=step;
		}
			
		in.close();
	}

}
