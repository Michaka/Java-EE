import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int numberOne,numberTwo;
		
		do{
			System.out.println(" Please enter a number between 1 and 9.");
			numberOne=in.nextInt();
			System.out.println(" Please enter a number between 1 and 9.");
			numberTwo=in.nextInt();
		}while(numberOne<1||numberTwo<1||numberTwo>9||numberOne>9);
		for(int index=1;index<=numberOne;index++){
			for(int indexTwo=1;indexTwo<=numberTwo;indexTwo++){
				System.out.println(index+"*"+indexTwo+"="+(index*indexTwo));
			}
		}
		in.close();
	}

}
