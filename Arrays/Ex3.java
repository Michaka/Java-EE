import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int firstNumber =in.nextInt(),secondNumber=in.nextInt();
		int [] array= new int [10];
		array[0]=firstNumber;
		array[1]=secondNumber;
		for(int elem=2;elem<10;elem++){
			
				array[elem]=array[elem-2]+array[elem-1];		
		}
		
		System.out.println(Arrays.toString(array));
		in.close();

	}

}
