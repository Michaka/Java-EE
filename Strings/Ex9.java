import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine().toLowerCase().trim();
		int number=0,sum=0;
		boolean flag=false;
		for(int index=0;index<string.length();index++){
			if(string.charAt(index)>='0' && string.charAt(index)<='9'){
				number+=string.charAt(index)-'0';
				number*=10;
			}
			else{
				if(flag==true){
					number*=-1;
				}	
				sum+=(number/10);
				number=0;
				flag=false;
			}
			if(string.charAt(index)=='-'){
				flag=true;
			}	
		}
		if(flag==true){
			number*=-1;
			flag=false;
		}
		sum=sum+(number/10);
		System.out.println(sum);
		in.close();
	}

}
