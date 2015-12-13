import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String stringOne=in.nextLine(),stringTwo=in.nextLine();
		for(int index=0;index<stringOne.length();index++){
			if(stringOne.charAt(index)!=stringTwo.charAt(index)){
				System.out.println(index+1+" "+stringOne.charAt(index)+", "+stringTwo.charAt(index));
			}
		}
		in.close();
		
	

	}

}
