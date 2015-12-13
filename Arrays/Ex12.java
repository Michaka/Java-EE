import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=7;
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		int helper;
		helper=array[0];
		array[0]=array[1];
		array[1]=helper;
		array[2]+=array[3];
		array[3]=array[2]-array[3];
		array[2]=array[2]-array[3];
		array[4]*=array[5];
		array[5]=array[4]/array[5];
		array[4]=array[4]/array[5];
		System.out.println(Arrays.toString(array));
	
			
		in.close();

	}

}
