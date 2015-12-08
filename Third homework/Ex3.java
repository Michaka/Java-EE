import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int rowCount =in.nextInt(),columnCount=in.nextInt(),sum=0;
		
		int [][] array=new int [rowCount][columnCount];
		for(int row=0;row<rowCount;row++){
			for(int column =0;column<columnCount;column++){
				array[row][column]=in.nextInt();
				sum+=array[row][column];
			}
		}
	System.out.println("the sum of the elements is: "+sum);
	System.out.println("the average of the elements is: "+(double)(sum/(rowCount*columnCount)));
	in.close();
	}

}
