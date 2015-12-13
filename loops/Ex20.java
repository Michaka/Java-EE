
public class Ex20 {

	public static void main(String[] args) {
		int counter;
		for(int index=0;index<10;index++){
			counter=index+1;
			for(int indexTwo=0;indexTwo<10;indexTwo++){
				if(counter==10){
					counter=0;
				}
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}

	}

}
