import java.util.Scanner;

public class BMICalculator{

   public static String calculateBMI(double weightKg, double heightMeters){

	double bmi = weightKg / (heightMeters * heightMeters);


	if(bmi < 18.5){
	 return "UnderWeight";
	
	}else if (bmi >= 18.5 && bmi <= 24.9){
	   return "Normal Weight";
	
	} else if (bmi >= 25 && bmi <= 29.9){
		return "OverWeight";
	}
	else{
	     return "Obese";
	}
}

  public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

		
		System.out.print("What do you weigh? (in Kg): ");	
                  double weightKg = input.nextDouble();
		
		System.out.print("What's your height? (in Meters): ");
		double heightMeters = input.nextDouble();

		String result = calculateBMI(weightKg, heightMeters);

		System.out.println("Your BMI Category is " + result);

}
}