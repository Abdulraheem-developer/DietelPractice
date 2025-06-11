public class ConditionalLogic{

public static void serveBreakfast(String food, int quantity){

	if(quantity > 3){

	System.out.println("That's a feast!, Enjoy your " + food);

	}else{
	
	System.out.println("Here's your " + quantity + " plate(s) of " + food);	

	}

 }


public static void main(String[] args){

	serveBreakfast("Abacha", 16);	

}
}