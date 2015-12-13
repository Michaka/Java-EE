import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,k=0;
		
		do{
			System.out.println(" Please enter a positive number .");
			number=in.nextInt();
		}while(number<1);
		for(int indexOne=0;indexOne<number;indexOne++){
			for(int indexTwo=0;indexTwo<(number*2-1);indexTwo++){
				if(indexTwo<((((number*2)/2)-1)-k) || indexTwo>((((number*2)/2)-1)+k)){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
			k++;
		}
		in.close();

	}

}
