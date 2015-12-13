import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int firstArrayCount=in.nextInt(),secondArrayCounter=in.nextInt(),thirdArrayCounter=0;
		int [] firstArray=new int[firstArrayCount],secondArray=new int[secondArrayCounter];
		if(firstArrayCount<secondArrayCounter){
			thirdArrayCounter=firstArrayCount;
		}
		else{
			thirdArrayCounter=secondArrayCounter;
		}
		for(int elem=0;elem<firstArrayCount;elem++){
			firstArray[elem]=in.nextInt();
		}
		int [] thirdArray=new int [thirdArrayCounter];
		for(int elem=0;elem<secondArrayCounter;elem++){
			secondArray[elem]=in.nextInt();
		}
		for(int elem=0;elem<thirdArrayCounter;elem++){
				if(firstArray[elem]>secondArray[elem]){
					thirdArray[elem]=firstArray[elem];
				}
				else{
					thirdArray[elem]=secondArray[elem];
				}
		}
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		System.out.println(Arrays.toString(thirdArray));
	}

}
