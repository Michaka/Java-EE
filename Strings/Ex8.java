import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine().toLowerCase().trim();
		boolean flag=true;
		for(int index =0;index<string.length()/2;index++){
			if(string.charAt(index)!=string.charAt(string.length()-index-1)){
				flag=false;
			}
		}
		System.out.println(flag);
		in.close();
	}

}
