import java.util.Scanner;



public class Ex5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String stringOne=in.nextLine(),stringTwo=in.nextLine();
		int end,index=0;
		if(stringOne.length()<stringTwo.length()){
			end=stringOne.length();
		}
		else{
			end=stringTwo.length();
		}
		for(index=0;index<end;index++){
			if(stringOne.charAt(index)==stringTwo.charAt(index)){
				break;
			}
		}
		for(int row=0;row<stringTwo.length();row++){
			for(int col=0;col<index;col++){
				if(row==index){
					System.out.println(stringOne);
					break;
				}
				else{
					System.out.print(" ");
				}
			}
			if(row==index){
			}
			else{
				System.out.println(stringTwo.charAt(row));
			}
		}
		in.close();
	}

}
