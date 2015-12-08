import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt(),min=Integer.MAX_VALUE;
		
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
			
				array[elem]=in.nextInt();		
		}
		for(int elem =0;elem<elemCount;elem++){
			if(array[elem]%3==0 && array[elem] <min){
				min=array[elem];
			}
		}
		System.out.println("the lowest number mupliple 3 is: "+min);
		in.close();
	}

}
