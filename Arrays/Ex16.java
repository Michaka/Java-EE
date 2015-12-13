import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=10,counter=0;
		double [] array=new double[elemCount];
		double sum=0.0;
		for(int elem=0;elem<elemCount;elem++){
			
				array[elem]=in.nextDouble();
				
				if(array[elem]==0){
					counter++;
				}
				sum=sum+array[elem];
		}
		System.out.println(Arrays.toString(array));
		for(int elem=0;elem<elemCount;elem++){
			if(array[elem]<(-0.231)){
				array[elem]=((elem+1)*(elem+1))+41.25;
			}
			else{
				array[elem]*=(elem+1);
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(sum/(10-counter));
	}
	 
} 
