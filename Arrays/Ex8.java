import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount =in.nextInt(),maxCounter=0,counter=1,elemDup=0;
		
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		elemDup=array[0];
		for(int elem =0;elem<elemCount-1;elem++){
			if(array[elem]==array[elem+1]){
				counter++;
				if (counter>maxCounter){
					maxCounter=counter;
					elemDup=array[elem+1];
				}
			}
			else{
				
				counter=1;
			}
			
		}
		for(int count=0;count<maxCounter;count++){
			System.out.print(elemDup+",");
		}
			
		in.close();


	}

}
