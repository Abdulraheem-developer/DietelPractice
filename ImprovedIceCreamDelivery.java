import java.util.Scanner;

public class ImprovedIceCreamDelivery{
 public static void main(String[] args){

	int deliveries = 0;
	
	Scanner input = new Scanner(System.in);

	System.out.print("How many streets are you delivering to ?: ");

	int street_no = input.nextInt();

	System.out.print("How many houses are you delivering to?: ");

	int house_no = input.nextInt();

	for(int street = 1; street <= street_no; street++){
	  System.out.println("Going to Street #" + street);
	
		for(int house = 1; house <= house_no; house++){
		System.out.println("Delivered ice-cream to house #" + house + " on Street #" + street );

			deliveries++;
		}
	
			System.out.println();
	}
		System.out.println("We made " + deliveries + " deliveries today, Thanks for keeping us in business");

}

}