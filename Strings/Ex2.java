import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String stringOne=in.nextLine(),stringTwo=in.nextLine();
		String newStringOne=stringTwo.substring(0,5)+stringOne.substring(6,stringOne.length());
		String newStringTwo=stringOne.substring(0,5)+stringTwo.substring(6,stringTwo.length());
		if(newStringOne.length()>newStringTwo.length()){
			System.out.println(newStringOne.length()+", "+newStringOne);
		}
		else{
			System.out.println(newStringTwo.length()+", "+newStringTwo);
		}
		in.close();
	}

}
