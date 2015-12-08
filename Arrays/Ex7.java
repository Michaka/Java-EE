import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt();
		
		int [] array=new int[elemCount],secondArray=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
	
		for(int elem =0;elem<elemCount;elem++){
			if(elem==0){
				secondArray[elem]=array[elemCount-1]+array[elem+1];
			}
			if(elem==elemCount-1){
				secondArray[elem]=array[elem-1]+array[0];
			}
			if(elem>0 && elem< elemCount-1){
				secondArray[elem]=array[elem-1]+array[elem+1];
			}
			
		}
		System.out.println(Arrays.toString(secondArray));
			
		in.close();

	}

}
