import java.util.Arrays;

public class Ex12 {
	static int[] input(int num){
		int [] arr=new int[num];
		for(int index=0;index<num;index++){
			arr[index]=index+1;
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(input(7)));

	}

}
