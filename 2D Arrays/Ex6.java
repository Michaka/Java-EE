
public class Ex6 {

	public static void main(String[] args) {
		int [][]arr={   {11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}};
		int rowCounter=arr.length,columnCounter=arr[0].length,row=0,column=0,sum=0,fullSum=0;
		while(row<rowCounter){
			if(column==columnCounter){	
				column=0;
				if((row+1)%2==0){
					System.out.println(" the sum of the elemnets in the row is: "+sum);
				}
				fullSum+=sum;
				sum=0;
				row++;
			}
			else{
				if((row+1)%2==0){
					sum+=arr[row][column];
					System.out.print(+arr[row][column]+",");	
				}
				column++;
			}
		}
		System.out.println("the sum of the elemnets is: "+fullSum);


	}

}
