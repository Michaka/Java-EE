import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=7,counter=0;
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		for(int elem=0;elem<elemCount;elem++){
			if(array[elem]>=5 && array[elem]%5==0){
				System.out.print(array[elem]+", ");
				counter++;
			}
		}
		
		System.out.println(counter +"elements");
	
			
		in.close();
	}

}
