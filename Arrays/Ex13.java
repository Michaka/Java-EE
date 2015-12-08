import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=1,number=in.nextInt(),numberCopy;
		numberCopy=number;
		while(number/2!=0){
			elemCount++;
			number/=2;
		}
		int [] array=new int[elemCount];
		for(int elem=elemCount-1;elem>=0;elem--){
			array[elem]=numberCopy%2;
			numberCopy/=2;
		}
		System.out.println(Arrays.toString(array));
	}

}
