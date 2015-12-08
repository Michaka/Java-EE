import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int amount,counter_of_bucket_one,counter_of_bucket_tow,helper;
		System.out.println("Enter the volume of the tank between 10 and 9999:");
		amount=in.nextInt();
		if(amount<10 || amount >9999){
			System.out.println("The volume should be between 10 and 9999. Please enter a number between 10 and 9999, next time.");
		}
		else{
			helper=amount%5;
			counter_of_bucket_one=amount/5;
			counter_of_bucket_tow=counter_of_bucket_one;
			if(helper==1){
				counter_of_bucket_one--;
				System.out.println(counter_of_bucket_one+" times 2 liter buckets\n"+ counter_of_bucket_tow+" times  3 liter buckerts\nand aditional one bucket of 3 liters");
				
			}
			else{
				if(helper==2){
				System.out.println(counter_of_bucket_one+" times 2 liter buckets\n"+ counter_of_bucket_tow+" times  3 liter buckerts\nand aditional one bucket of 2 liters");
				}
				if(helper==3){
					System.out.println(counter_of_bucket_one+" times 2 liter buckets\n"+ counter_of_bucket_tow+" times 3 liter buckerts\nand aditional one bucket of 3 liters");
					}
				if(helper==0){
					System.out.println(counter_of_bucket_one+" times 2 liter buckets\n"+ counter_of_bucket_tow+" times  3 liter buckerts");
					}
				if(helper==4){
					counter_of_bucket_one+=2;
					System.out.println(counter_of_bucket_one+" times 2 liter buckets\n"+ counter_of_bucket_tow+" times  3 liter buckerts");
				}
				}
		}
		in.close();
	}

}
