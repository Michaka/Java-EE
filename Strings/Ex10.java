import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		for(int index=0;index<string.length()-1;index++){
			if(string.charAt(index+1)!=string.charAt(index)){
			string=string.replace(string.charAt(index),(char)(string.charAt(index)+5));
			}
		}
		string=string.replace(string.charAt(string.length()-1),(char)(string.charAt(string.length()-1)+5));
		System.out.println(string);
		in.close();
	}

}
