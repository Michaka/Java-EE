import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt();
		boolean flag=true;
		
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
			
				array[elem]=in.nextInt();		
		}
		for(int elem =0;elem<elemCount/2;elem++){
			if(array[elem]!=array[elemCount-1-elem]){
				flag=false;
			}
		}
		if(flag){
			System.out.println("the array is specular");
		}else{
			System.out.println("the array is not specular");
		}
		in.close();

	}

}
