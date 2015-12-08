
public class Ex5 {

	public static void main(String[] args) {
		int [][]arr={  { 1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		int rowCounter=0,columnCounter=0,maxRowCounter=Integer.MIN_VALUE,maxColumnCounter=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++ ){
			for(int column=0;column<arr[0].length;column++){
				rowCounter+=arr[row][column];
				columnCounter+=arr[column][row];
			}
			if(rowCounter>maxRowCounter){
				maxRowCounter=rowCounter;
				
			}
			if(columnCounter>maxColumnCounter){
				maxColumnCounter=columnCounter;
			}
			rowCounter=0;
			columnCounter=0;
		}
		System.out.println("the max row count is: "+maxRowCounter);
		System.out.println("the max column count is: "+maxColumnCounter);
		if(maxColumnCounter == maxRowCounter){
			System.out.println("the max row count = the max column count");
		}
		if(maxColumnCounter < maxRowCounter){
			System.out.println("the max row count > the max column count");
		}
		if(maxColumnCounter > maxRowCounter){
			System.out.println("the max row count < the max column count");
		}
	}

}
