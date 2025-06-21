public class studentGrade{

public static String calculateGrade(int grade){


	if(grade >= 90 && grade <= 100){
		return "A";
	} else if(grade >= 80  && grade <= 89){
		return "B";
	}else if(grade >= 70 && grade <= 79){
		return "C";
	}else if(grade >= 60 && grade <= 69){
		return "D";
	}else if(grade < 60){
		return "F";
	}else{
		return "Invalid Score";
	}


} 





  public static void main(String[] args){

	System.out.println("Enter a score: ");
		String grade = calculateGrade(49);
	System.out.println("Grade: " + grade);




}
}