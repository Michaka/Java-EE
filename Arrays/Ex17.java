import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int elemCount=in.nextInt(),counter=0;
		int [] array=new int[elemCount];
		for(int elem=0;elem<elemCount;elem++){
				array[elem]=in.nextInt();		
		}
		boolean flag=true;
		if(array[0]>array[1]){
			flag = false;
		}
		for(int elem=1;elem<elemCount-1;elem++){
			boolean lessThanNeigh = ((array[elem] < array[elem-1]) && (array[elem] < array[elem+1]));
			boolean greaterThanNeight = ((array[elem] > array[elem-1]) && (array[elem] > array[elem+1]));
			
			if (!(lessThanNeigh || greaterThanNeight)) {
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("nazaben nagore");
		}
		else{
			System.out.println("ne e nazaben na gore");
		}
	}

}
