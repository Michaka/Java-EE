import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String stringOne=in.nextLine(),stringTwo=in.nextLine();
		System.out.println(stringOne.toUpperCase()+" "+stringOne.toLowerCase()+" "+stringTwo.toUpperCase()+" "+stringTwo.toLowerCase());
		in.close();
	}

}
