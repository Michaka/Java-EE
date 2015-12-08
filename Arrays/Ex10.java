import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=7,sum=0,firstCloseNumber=0,secondCLoseNumber=0;
		double average;
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		
		for(int elem =0;elem<elemCount;elem++){
			sum+=array[elem];
			
		}
		average=(double)(sum/elemCount);
		for(int elem=0;elem<elemCount;elem++){
			for(int secondElem=0;secondElem<elemCount;secondElem++){
				if(array[elem]>array[secondElem]){
					array[elem]+=array[secondElem];
					array[secondElem]=array[elem]-array[secondElem];
					array[elem]=array[elem]-array[secondElem];
				}
			}
		}
		for(int elem=0;elem<elemCount-1;elem++){
			if(array[elem]>=average&& array[elem+1]<=average){
				firstCloseNumber=array[elem];
				secondCLoseNumber=array[elem+1];
				break;
			}
		}
		System.out.println("the average is " + average);
		if(firstCloseNumber-average>average-secondCLoseNumber){
			System.out.println(" the closest number is " +secondCLoseNumber);
		}
		else{
			System.out.println("the closest number is "+secondCLoseNumber);
		}
	
			
		in.close();

	}

}
