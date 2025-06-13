import java.util.Scanner;

public class ImprovedMultiplicationTable{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a range for the multiplication table: ");
	int n = input.nextInt();
	
	for(int num = 1; num <= n; num++){
	
	 System.out.println("\nMultiplication Table for: " + num);

	for(int i = 1; i <= 12; i++){
	System.out.println(num + " x " + i + " = " + (num * i));
	
	}                
	
	}	
	
	
}
}