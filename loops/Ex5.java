import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int numberOne,numberTwo;
		
		
			System.out.println(" Please enter a  number .");
			numberOne=in.nextInt();
			System.out.println(" Please enter a number .");
			numberTwo=in.nextInt();
			if(numberOne>numberTwo){
				numberOne=numberOne^numberTwo;
				numberTwo=numberOne^numberTwo;
				numberOne=numberOne^numberTwo;
			}
		for(int index=numberOne;index<=numberTwo;index++){
		
				System.out.print(index+" ");
			
		}
		in.close();

	}

}
