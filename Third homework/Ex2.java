import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int rowCount =in.nextInt(),columnCount=in.nextInt();
		
		int [][] array=new int [rowCount][columnCount];
		for(int row=0;row<rowCount;row++){
			for(int column =0;column<columnCount;column++){
				array[row][column]=in.nextInt();
				
			}
		}
		int column=0;
		for(int row=0;row<rowCount;row++){
			System.out.print(array[row][column]+", ");
			column++;
		}
		System.out.println();
		 column=0;
		for(int row=rowCount-1;row>=0;row--){
			System.out.print(array[row][column]+", ");
			column++;
		}
		in.close();

	}

}
