import java.util.Arrays;

public class Ex13 {
	static int [] arrCat(int []arrayOne,int [] arrayTwo){
		int [] arrayThree=new int [arrayOne.length+arrayTwo.length];
		for(int index=0;index<arrayThree.length;index++){
			if(index<arrayOne.length){
				arrayThree[index]=arrayOne[index];
			}
			else{
				arrayThree[index]=arrayTwo[index-arrayOne.length];
			}
		}
		return arrayThree;
	}
	public static void main(String[] args) {
		int[]arr1={1,3,2,4,2,3},arr2={3,4,5,36,3};
System.out.println(Arrays.toString(arrCat(arr1,arr2)));
	}

}
