public class Ex23 {

	public static void main(String[] args) {
		int helper=1,counter;
			
			while(helper<=9){
				System.out.print("line "+helper+": ");
				counter=helper;
				while(counter<=9){
					System.out.print(helper+"*"+counter+"; ");
					counter++;
				}
				helper++;
				System.out.println();
			}
	}

}
