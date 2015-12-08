import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=in.nextInt(),counter=0;
		double [] array=new double[elemCount];		
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextDouble();		
		}
		for(int elem=0;elem<elemCount;elem++){
			if(array[elem]>=-2.99 && array[elem]<=2.99){
				
				counter++;
			}
		}
		double [] secondArray=new double[counter];
		int element=0;
		for(int elem=0;elem<elemCount;elem++){
			if(array[elem]>=-2.99 && array[elem]<=2.99){
				
				secondArray[element]=array[elem];
				element++;
			}
		}
		System.out.println(Arrays.toString(secondArray));
	}

}

