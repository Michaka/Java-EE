import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=in.nextInt(),counter=0;
		double [] array=new double[elemCount];		
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextDouble();
				if(array[elem]<0){
					array[elem]*=-1;
				}
		}
		for(int elem=0;elem<elemCount;elem++){
			for(int secondElem=0;secondElem<elemCount;secondElem++){
				if(array[elem]>array[secondElem]){
					array[elem]+=array[secondElem];
					array[secondElem]=array[elem]-array[secondElem];
					array[elem]=array[elem]-array[secondElem];
				}
			}
		}
		counter=0;
		for(counter=0;counter<3;counter++){
			System.out.print(array[counter]+", ");
		}

	}

}
