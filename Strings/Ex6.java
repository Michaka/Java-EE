import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine().toLowerCase().trim();
		System.out.print((char)(string.charAt(0)-32));
		for(int index=1;index<string.length();index++){
			if(string.charAt(index-1)!=' '){
				System.out.print(string.charAt(index));
			}
			else{
				System.out.print((char)(string.charAt(index)-32));
			}
		}
		in.close();
	}

}
