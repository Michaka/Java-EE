
public class Ex1 {

	public static void main(String[] args) {
		int [][]arr={ { 48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}};
		int maxElem=Integer.MIN_VALUE,minElem=Integer.MAX_VALUE;
		for( int row=0;row<arr.length-1;row++){
			for(int column=0;column<arr[0].length;column++){
				if(arr[row][column]>maxElem){
					maxElem=arr[row][column];
				}
				if(arr[row][column]<minElem){
					minElem=arr[row][column];
				}
			}
			
		}
		System.out.println("the min element is :"+minElem);
		System.out.println("the max element is :"+maxElem);

	}

}
