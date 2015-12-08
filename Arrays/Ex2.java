import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt();
		
		int [] array=new int[elemCount],secondArray=new int [2*elemCount];
		for(int elem=0;elem<elemCount;elem++){
			
				array[elem]=in.nextInt();		
		}
		int counter=1;
		for(int elem =0;elem<2*elemCount;elem++){
			if(elem<elemCount){
				secondArray[elem]=array[elem];
				
			}
			else{
				secondArray[elem]=array[elemCount-counter];
				counter++;
			}
		}
		System.out.println(Arrays.toString(secondArray));
		in.close();

	}

}
