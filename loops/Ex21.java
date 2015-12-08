import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number,helper=1,trigerOne,trigerTwo,counter;
		
		do{
			System.out.println(" Please enter a number between 1 and 52.");
			number=in.nextInt();
		}while(number<1||number>52);
			if(number%4==0){
				helper=number/4;
				trigerOne=4;
				}
			else{
				helper=number/4+1;
				trigerOne=number-(number/4)*4;
			}
			counter=number-1;
			
			trigerTwo=helper;
			
			for(;counter<52;counter++){
				switch(trigerTwo){
				case 1:{
					System.out.print("two of ");
					break;
				}
				case 2:{
					System.out.print("three of ");
					break;
				}
				case 3:{
					System.out.print("four of ");
					break;
				}
				case 4:{
					System.out.print("five of ");
					break;
				}
				case 5:{
					System.out.print("six of ");
					break;
				}
				case 6:{
					System.out.print("seven of ");
					break;
				}
				case 7:{
					System.out.print("eight of ");
					break;
				}
				case 8:{
					System.out.print("nine of ");
					break;
				}
				case 9:{
					System.out.print("ten of ");
					break;
				}
				case 10:{
					System.out.print("Jack of ");
					break;
				}
				case 11:{
					System.out.print("Queen of ");
					break;
				}
				case 12:{
					System.out.print("King of ");
					break;
				}
				case 13:{
					System.out.print("Ace of ");
					break;
				}
				
				}
				switch(trigerOne){
				case 1:{
					System.out.println("Clubs ");
					break;
				}
				case 2:{
					System.out.println("Diamonds ");
					break;
				}
				case 3:{
					System.out.println("Hearts ");
					break;
				}
				case 4:{
					System.out.println("Spades ");
					break;
				}
				}
				if(trigerOne==4){
					trigerOne=0;
					trigerTwo++;
				}
				trigerOne++;
			}
		
		in.close();
	}

}
