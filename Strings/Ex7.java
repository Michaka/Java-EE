import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine().toLowerCase().trim();
		int count=0,length=0,maxLength=0;
		for(int index=0;index<string.length();index++){
			if(string.charAt(index)==' ' || index==string.length()-1){
				count++;
				if(length>maxLength){
					maxLength=length;
				}
				length=0;
			}
			else{
				length++;
			}
		}
		System.out.println(count+" words, and the longest is  "+maxLength+" symbols.");
	in.close();
	}
	

}
