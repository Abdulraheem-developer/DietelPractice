import java.util.Scanner;

public class Cookies{
  public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 1;
	String choice = "no";

	while(counter <= 5){

	System.out.println("Visit #"+counter +":" + " Here's your cookie");
	System.out.print("Do you want another cookie?(yes/no): ");
	 choice = input.nextLine();

	if(choice.equalsIgnoreCase("yes")){
		counter++;
	
	}else{
		System.out.println("Come back tomorrow!");
	}
	}
		if(counter > 5){
		System.out.println("You've had enogh cookies for today, be going to your house!");
	}
		
}

}