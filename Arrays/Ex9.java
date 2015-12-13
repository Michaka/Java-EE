import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt();
		
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		
		for(int elem =0;elem<elemCount/2;elem++){
			array[elem]+=array[elemCount-1-elem];
			array[elemCount-1-elem]=array[elem]-array[elemCount-1-elem];
			array[elem]=array[elem]-array[elemCount-1-elem];
			
		}
		System.out.println(Arrays.toString(array));
			
		in.close();

	}

}
