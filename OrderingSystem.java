import java.util.Scanner;

public class OrderingSystem{
  public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String userInput = "";

	int counter = 0;

	while(!userInput.equalsIgnoreCase("done")){
		System.out.print("What would you like to order? (Type done to finish): ");
		userInput = input.nextLine();
		
		if(!userInput.equalsIgnoreCase("done")){
		System.out.println("Added " + userInput + " to your order ");
		counter++;
		}

	
	}
	  System.out.println("You've added " + counter + " item(s). Thanks for your order, we hope to see you again");
	

}
}