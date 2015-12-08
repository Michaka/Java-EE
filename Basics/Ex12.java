import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int day,month,year ;
		System.out.println("Enter the day:");
		day=in.nextInt();
		System.out.println("Enter the month:");
		month=in.nextInt();
		System.out.println("Enter the year:");
		year=in.nextInt();
		if(month<1|| month>12||day<1||day>31){
			System.out.println("The date is not correct. Please enter correct date next time.");
		}
		else{
			if(month==2 ){
				if(month%4==0 || month % 400!=0){
					if(day>29){
							System.out.println("The date is not correct. Please enter correct date next time.");
					}
					else{
						if(day>0&&day<29){
							System.out.println((day+1)+","+month+","+year);
						}
						else{
							System.out.println("1,3,"+year);
						}
					}
				}
				else{
					if(day>28){
						System.out.println("The date is not correct. Please enter correct date next time.");
					}
					else{
						if(day>0&&day<28){
							System.out.println((day+1)+","+month+","+year);
						}
						else{
							System.out.println("1,3,"+year);
						}
						}
					}
				
				}
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				if(month==12&& day==31){
					System.out.println("1,1,"+(year+1));
				}
				else{
					if(day>0&& day<31){
						System.out.println((day+1)+","+month+","+year);
					}
					else{
						System.out.println("1,"+(month+1)+","+year);
					}
				}
			}
			if(month==4||month==6||month==9||month==11){
				if(day>30){
					System.out.println("The date is not correct. Please enter correct date next time.");
				}
				else{
					if(day>0&& day<30){
						System.out.println((day+1)+","+month+","+year);
					}
					else{
						System.out.println("1,"+(month+1)+","+year);
					}
				}
			}
			}
		in.close();
		}
	}


