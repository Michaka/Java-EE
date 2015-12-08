import java.util.Arrays;


public class Ex5 {

	public static void main(String[] args) {
		int [] array= new int [10];
		for(int elem=0;elem<10;elem++){
			
				array[elem]=(elem+1)*3;		
		}
		
		System.out.println(Arrays.toString(array));
		

	}

}
