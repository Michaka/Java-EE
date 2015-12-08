import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int numberOne,numberTwo;
		
		do{
			System.out.println(" Please enter a number between 10 and 5555.");
			numberOne = in.nextInt();
			System.out.println(" Please enter a number between 10 and 5555.");
			numberTwo = in.nextInt();
		}while((numberOne < 10 || numberOne > 5555)&&(numberTwo<10 || numberTwo>5555));
		
		if( numberTwo < numberOne ){
			numberTwo=numberTwo^numberOne;
			numberOne=numberTwo^numberOne;
			numberTwo=numberTwo^numberOne;
		}
		for(int index=numberTwo;index>numberOne;index--){
			if(index%50==0){
				System.out.println(index);
			}
			
		}
		in.close();
		
	}

}
