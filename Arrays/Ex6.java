import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int firstArrayCount =in.nextInt(),secondArrayCount=in.nextInt();
		
		int [] firstArray=new int[firstArrayCount],secondArray=new int[secondArrayCount];
		boolean flag=true;
		
		
		for(int elem=0;elem<firstArrayCount;elem++){
			firstArray[elem]=in.nextInt();
		}
		for(int elem=0;elem<secondArrayCount;elem++){
			secondArray[elem]=in.nextInt();
		}
		
		if(firstArray.length!=secondArray.length){
			System.out.println("the arrays are not equal because there length are different ");
		}
		else{
			for(int elem=0;elem<firstArrayCount;elem++){
				if(firstArray[elem]!=secondArray[elem]){
					flag=false;
				}
			}
		if(flag){
			System.out.println("the arrays are equal and there lengths are equal");
		}
		else{
			System.out.println("the arrays are not equal but there lenghts are equal");
		}}
		in.close();
	}

}
