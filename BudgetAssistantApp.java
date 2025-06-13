import java.util.Scanner;

public class BudgetAssistantApp{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String response = "";
	do {

	System.out.println("Welcome to Abdulraheem's Budget Assistant! Let's Manage your money for you :)");
	
	System.out.print("How much do you have in your wallet? ₦: ");
	  double wallet = input.nextDouble();

	System.out.print("How much is the washing machine? ₦: ");
		double wmPrice = input.nextDouble();

	System.out.print("How many do you want? : ");
		int wmQty = input.nextInt();

	System.out.print("How much is the fridge? ₦: ");
		double frPrice = input.nextDouble();

	System.out.print("How many do you want? : ");
		int frQty = input.nextInt();

	System.out.print("How much is the TV? (₦): ");
		double tvPrice = input.nextDouble();

	System.out.print("How many do you want? : ");
		int tvQty = input.nextInt();



	double totalWmachine = wmPrice * wmQty;

	double totalFridge = frPrice * frQty;
	
	double totalTV = tvPrice * tvQty;

	double grandTotal = totalWmachine + totalFridge + totalTV;


	System.out.println("\n---Receipt Summary -----");
	System.out.println("Washing Machine: ₦" + totalWmachine);
	System.out.println("Fridge: ₦" + totalFridge);
	System.out.println("'85 inches 4k OLED Display Smart TV: ₦" + totalTV);
	System.out.println("Grand Total: " + grandTotal);

	if(wallet >= grandTotal){
          double balance = wallet - grandTotal;
		System.out.println("Transaction Successful! Your balance is " + balance);
	} else {
		double shortfall = grandTotal - wallet;
		System.out.println("Insufficient funds! You need " + shortfall + " to balance up!");
		}
	
   System.out.println("Thank you for using our Budget Assistant! We hope to serve you better, next time :)");	


	input.nextLine(); 
	System.out.println("Would you like to use Abdulraheem's budget Assistant again? (yes/no)");
        response = input.nextLine();

}while(response.equalsIgnoreCase("yes"));

System.out.println("Stay financially wise :)");

}		

}