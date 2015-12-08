public class Ex12 {

	public static void main(String[] args) {
		
		int firstDigit,secondDigit=0,thirdDigit=0;
		

		for(int i=102;i<999;i++){
			firstDigit=i;
			
				thirdDigit=firstDigit%10;
				firstDigit/=10;
				secondDigit=firstDigit%10;
				firstDigit/=10;
			if(firstDigit!=thirdDigit&&firstDigit!=secondDigit&&secondDigit!=thirdDigit){
				System.out.println(i);
			}
			else{
				
			}
		}
	}

}
