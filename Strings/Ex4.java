import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		int index=0,counterOne=0,counterTwo=0;
		while(string.charAt(index)!=','&& index<string.length()-1){
			index++;
		}
		String stringOne=string.substring(0, index),stringTwo=string.substring(index+1).trim();
		for( index=0;index<stringOne.length();index++){
			counterOne=counterOne+stringOne.charAt(index);
		}
		for( index=0;index<stringTwo.length();index++){
			counterTwo=counterTwo+stringTwo.charAt(index);
		}
		if(counterOne>counterTwo){
			System.out.println(stringOne);
		}
		else{
			System.out.println(stringTwo);
		}
		in.close();
	}

}
