

public class Ex4 {

	public static void main(String[] args) {
		int [][]arr={  { 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}},copyArray=new int [arr.length][arr[0].length];
		int counter=0;
		for( int column=0;column<arr[0].length;column++){
			for(int row=arr.length-1;row>=0;row--){
				copyArray[column][counter]=arr[row][column];
				counter++;
			}
			counter=0;
		}
		
		for( int row=0;row<arr.length;row++){
			for(int column=0;column<arr[0].length;column++){
				System.out.print(copyArray[row][column]+", ");
			}
			System.out.println();
		}
	}

}
