public class LoginSystem{
  public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int attempts = 1;
	String password = "Dhikhrullah";

	while(attempts <= 3){
	String userInput = input.nextLine();
	if(!userInput.equalsIgnoreCase("Dhikhrullah")){
	   System.out.println("Incorrect password. Try again");
		
		attempts++;

	}else{
		System.out.println("You got it");
		break;
	}
		
	if(attempts > 3){
		System.out.println("Acount locked after 3 tries.");
	}

	}

}
}